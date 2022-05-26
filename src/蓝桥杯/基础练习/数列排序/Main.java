package 蓝桥杯.基础练习.数列排序;

import java.util.Scanner;

/**
 * @author pengjiacheng
 * @create 2022-03-21 22:50
 * @description:
 */
public class Main {
    public static void main(String[] args) {
        //输入数列中数的个数
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        //输入数列
        int[] ints = new int[n];
        for (int i = 0; i < n; i++) {
            ints[i] = scanner.nextInt();
        }

        //对数列从小到大排序
        int temp = 0;
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints.length-i-1; j++) {
                if (ints[j]>ints[j+1]){
                    temp = ints[j];
                    ints[j] = ints[j+1];
                    ints[j+1] = temp;
                }
            }
        }

        for(int i=0;i<ints.length;i++) {
            System.out.printf(ints[i]+" ");
        }
    }
}
