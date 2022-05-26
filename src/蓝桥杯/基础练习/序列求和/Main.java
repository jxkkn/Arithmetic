package 蓝桥杯.基础练习.序列求和;

import java.util.Scanner;

/**
 * @author pengjiacheng
 * @create 2022-03-21 22:48
 * @description:
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println((long) n * (n + 1) / 2);
    }
}