package PAT.个人赛.T001害死人不偿命的猜想;

import java.util.Scanner;

/**
 * @author pengjiacheng
 * @create 2022-04-15 20:52
 * @description: 害死人不偿命的(3n+1)猜想
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int count = 0;
        while (n != 1){
            if (n%2 == 0){
                n/=2;
            }else {
                n=(3*n+1)/2;
            }
            count++;
        }
        System.out.println(count);
    }
}
