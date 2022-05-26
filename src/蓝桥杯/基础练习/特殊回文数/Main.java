package 蓝桥杯.基础练习.特殊回文数;

import java.util.Scanner;

/**
 * @author pengjiacheng
 * @create 2022-03-22 19:28
 * @description:
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 10000;i <= 999999;i++) {
            String str = Integer.toString(i);
            char[] ch = str.toCharArray();
            int len = ch.length;
            boolean flag = true;
            for(int k = 0, l = len-1;k < len / 2;k++, l--) {
                if(ch[k] != ch[l]) {
                    flag = false;
                    break;
                }
            }
            if(flag){
                int sum = 0;
                for(int j = 0; j < ch.length;j++) {
                    sum += Integer.valueOf(ch[j]) - 48;
                }
                if(sum == n) {
                    System.out.println(i);
                }
            }
        }
    }
}
