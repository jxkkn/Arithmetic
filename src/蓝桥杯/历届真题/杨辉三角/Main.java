package 蓝桥杯.历届真题.杨辉三角;

import java.util.Scanner;

/**
 * @author pengjiacheng
 * @create 2022-04-06 21:58
 * @description:
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int[][] arr=new int[100][100];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<=i;j++){
                if(j==0||i==j){
                    arr[i][j]=1;
                }else{
                    arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
                }
            }
        }
        int cnt=1;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<=i;j++){
                if(n==arr[i][j]){
                    System.out.println(cnt);
                    return;
                } else{
                    cnt++;
                }
            }
        }
    }
}
