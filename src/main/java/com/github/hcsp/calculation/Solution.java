package com.github.hcsp.calculation;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        System.out.println("x^2-2x+1=0的解是：" + Arrays.toString(calculate(1, -2, 1)));
        System.out.println("x^2-4=0的解是：" + Arrays.toString(calculate(1, 0, -4)));
        System.out.println("x^2+1=0的解是：" + Arrays.toString(calculate(1, 0, 1)));
    }

    // 计算一元二次方程ax^2+bx+c=0的根。
    // 若有两个根，返回一个数组，包含这两个根，即：new double[] { root1, root2 }
    // 若有一个根，返回一个数组，包含这个根，即：n返回new double[] { root }
    // 若没有根，返回一个空数组，即：new double[] {}
    // 提示，你可利用求根公式x=[-b±√(b²-4ac)]/2a
    // 需要执行开方运算时可使用Math.sqrt()方法
    public static double[] calculate(int a, int b, int c) {
        double discriminant = b * b - 4 * a * c; //b²-4ac 一元二次方程中的判别式
        double v1 = (-b + Math.sqrt(discriminant)) / 2 * 1;//求根公式
        double v2 = (-b - Math.sqrt(discriminant)) / 2 * 1;
        if(discriminant < 0) return new double[]{};  //定理1  ax2+bx+c=0（a≠0）中，△＜0方程没有实数根。
        return discriminant == 0 ? new double[]{v1} : new double[]{v1, v2};//定理2  ax2+bx+c=0（a≠0）中，△＞0方程有两个不等实数根。定理3  ax2+bx+c=0（a≠0）中，△=0方程有两个相等实数根；
    }
}
