package 蓝桥杯.历届真题.时间显示;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @author pengjiacheng
 * @create 2022-04-06 23:01
 * @description:
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        n-=8*60*60*1000;
        Date date=new Date(n);
        System.out.println(new SimpleDateFormat("HH:mm:ss").format(date));
    }
}
