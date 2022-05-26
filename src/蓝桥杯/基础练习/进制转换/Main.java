package 蓝桥杯.基础练习.进制转换;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author pengjiacheng
 * @create 2022-03-22 18:02
 * @description:
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        String[] a = new String[m];
        for(int i = 0; i < m; ++i) {
            a[i] = sc.next();
        }
        for(int i = 0; i < m; ++i) {
//            十六进制转十进制
            System.out.println(new BigInteger(a[i],16).toString(10));
//            十六进制转八进制
            System.out.println(new BigInteger(a[i],16).toString(8));
//            十进制转十六进制
            System.out.println(new BigInteger(a[i],10).toString(16).toUpperCase());
        }
    }
}
