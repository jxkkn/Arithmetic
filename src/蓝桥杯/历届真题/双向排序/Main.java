package 蓝桥杯.历届真题.双向排序;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author pengjiacheng
 * @create 2022-04-07 8:34
 * @description:
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int[] ints = new int[n];
        for (int i = 0; i < n; i++) {
            ints[i] = i+1;
        }

        for (int i = 0; i < m; i++) {
            int p = scanner.nextInt();
            int q = scanner.nextInt();
            if (p == 0){
                Arrays.sort(ints,0,q);
                for(int x = 0 , y = q -1; x < y ; x ++ , y --){
                    int temp = ints[x];
                    ints[x] = ints[y];
                    ints[y] = temp;
                }
            }else {
                Arrays.sort(ints,q-1,m);
            }
        }
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i]+" ");
        }
    }
}
