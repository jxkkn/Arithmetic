package PAT.个人赛.T005继续猜想;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author pengjiacheng
 * @create 2022-04-16 13:58
 * @description: 继续(3n+1)猜想
 */
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] gjs = new int[n]; // 关键数，给个长度就假设关键数有n个
        int gjsIndex = 0; // 关键数下标
        int[] list = new int[999]; // 集合列表，假设最长有999个。这里就不用ArrayList了，毕竟自动装箱拆箱啥的浪费时间内存
        int listIndex = 0;
        s.nextLine();
        String line = s.nextLine();
        // 如果只输入了一个值,这里不用判断也行，测试点中输入的n好像都大于1
        if (n == 1) {
            System.out.println(line);
            return;
        }
        String[] strNumbers = line.split(" ");
        for (int i = 0; i < strNumbers.length; i++) {
            Integer num = Integer.valueOf(strNumbers[i]);
            // 遍历集合判断当前这个数是否存在集合list中
            boolean exist = isExist(num, list);
            // 如果该数存在在集合中，那么跳过此数
            if (exist) continue;
            // 如果该数不存在在集合中，那么将该数加入关键数数组gjs中，同时将计算的数放入集合中
            gjs[gjsIndex++] = num;
            while (num != 1) {
                if (num % 2 == 0) {
                    num = num / 2;
                } else {
                    num = (3 * num + 1) / 2;
                }
                // 遍历集合，判断当前这个数是否存在集合list中
                boolean exist02 = isExist(num, list);
                // 如果集合中包含当前计算出的数，那么退出。
                if (exist02) break;
                // 如果集合中不包含，则将计算出的数放入集合
                list[listIndex++] = num;
            }
        }
        // 遍历所有关键数
        for (int i = 0; i < gjs.length; i++) {
            // 如果关键数数组中的关键数包含在集合中，那么删除。
            boolean exist = isExist(gjs[i], list);
            if (exist) {
                gjs[i] = 0;
            }
            // 如果当前关键数和该数组中其他数相等，那么该数删除
            for (int j = i+1; j < gjs.length; j++) {
                if (gjs[i] == gjs[j]) {
                    gjs[i] = 0;
                }
            }
        }
        // 数组排序
        Arrays.sort(gjs);
        StringBuffer print = new StringBuffer();
        for (int i = gjs.length-1; i >= 0; i--) {
            if (gjs[i] == 0) continue;
            print.append(gjs[i] + " ");
        }
        System.out.println(print.toString().trim());
    }

    /** 判断一个数是否存在与某个数组中,该数组中所有数字都大于0 */
    public static boolean isExist(int num, int[] list) {
        for (int j = 0; j < list.length; j++) {
            if (list[j] == 0) break;
            if (num == list[j]) {
                return true;
            }
        }
        return false;
    }
}
