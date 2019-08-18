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
        double value = b * b - 4 * a * c;
        if (value < 0) {
            return new double[0];
        } else if (value > 0) {
            double resultOne = -b + (Math.sqrt(value)) / (2 * a);
            double resultTwo = -b - (Math.sqrt(value)) / (2 * a);
            double[] result = new double[2];
            result[0] = resultOne;
            result[1] = resultTwo;
            return result;
        } else {
            return new double[]{-b / (2 * a)};
        }
    }
}
