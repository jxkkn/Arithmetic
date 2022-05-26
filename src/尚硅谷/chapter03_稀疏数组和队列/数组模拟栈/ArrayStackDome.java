package 尚硅谷.chapter03_稀疏数组和队列.数组模拟栈;

import java.util.Scanner;

/**
 * @author pengjiacheng
 * @create 2022-05-25 21:11
 * @description:
 */
public class ArrayStackDome {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(4);

        System.out.println(stack.ifFull());
        System.out.println(stack.ifEmply());

        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("1.入栈");
            System.out.println("2.出栈");
            System.out.println("3.遍历栈");
            System.out.println("0.退出");
            int i = scanner.nextInt();
            switch (i){
                case 1:
                    System.out.println("请输入要入栈的数:");
                    int value = scanner.nextInt();
                    stack.push(value);
                    break;
                case 2:
                    try {
                        int pop = stack.pop();
                        System.out.println("出栈数据为:"+pop);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    stack.list();
                    break;
                case 0:
                    System.out.println("再见");
                    return;
                default:
                    System.out.println("输入错误,请重新输入");
            }
        }
    }
}
