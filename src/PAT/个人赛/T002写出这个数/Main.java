package PAT.个人赛.T002写出这个数;

import java.util.Scanner;

/**
 * @author pengjiacheng
 * @create 2022-04-16 10:31
 * @description:
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] nums = {"ling", "yi", "er", "san", "si", "wu", "liu", "qi", "ba", "jiu"};
        scanner.close();
        int sum = 0;
        for(int i=0; i<str.length(); i++) {
            sum += str.charAt(i)-'0';
        }
        String stringSum = String.valueOf(sum);
        for(int i=0; i<stringSum.length()-1; i++) {
            System.out.print(nums[stringSum.charAt(i)-'0']+" ");
        }
        System.out.print(nums[stringSum.charAt(stringSum.length()-1)-'0']);
    }
}
