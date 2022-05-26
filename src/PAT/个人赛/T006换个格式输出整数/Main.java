package PAT.个人赛.T006换个格式输出整数;

import java.util.Scanner;

/**
 * @author pengjiacheng
 * @create 2022-04-16 14:56
 * @description:
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        bai(num);
        shi(num);
        ge(num);
    }
    public static void ge(int num){
        for (int i = 1; i <= num%10; i++) {
            System.out.print(i);
        }
    }
    public static void shi(int num){
        for (int i = 0; i < num/10%10; i++) {
            System.out.print('S');
        }
    }
    public static void bai(int num){
        for (int i = 0; i < num/100; i++) {
            System.out.print('B');
        }
    }
}
