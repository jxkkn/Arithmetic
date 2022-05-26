package PAT.个人赛.T004成绩排名;

import java.util.*;

/**
 * @author pengjiacheng
 * @create 2022-04-16 13:43
 * @description:
 */

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String []name = new String[n];
        String []num = new String[n];
        int []score = new int[n];
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            name[i] = sc.next();
            num[i] = sc.next();
            score[i] = Integer.parseInt(sc.next());
            list.add(score[i]);
        }
        Arrays.sort(score);
        int max = list.indexOf(score[n-1]);
        int min = list.indexOf(score[0]);
        System.out.println(name[max]+" "+num[max]);
        System.out.println(name[min]+" "+num[min]);
    }
}
