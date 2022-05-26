package 尚硅谷.chapter03_稀疏数组和队列.数组模拟栈;

/**
 * @author pengjiacheng
 * @create 2022-05-25 21:09
 * @description:
 */
public class ArrayStack {
    private int maxSize;//栈的大小
    private int[] stack;//数组模拟栈
    private int top = -1;//栈顶

    //构造器
    public ArrayStack(int maxSize) {
        this.maxSize = maxSize;
        this.stack = new int[maxSize];
    }

    //栈满
    public boolean ifFull() {
        return top == maxSize - 1;
    }

    //栈空
    public boolean ifEmply() {
        return top == -1;
    }

    //入栈
    public void push(int value) {
        //判断是否栈满
        if (ifFull()) {
            System.out.println("栈满");
            return;
        } else {
            top++;
            stack[top] = value;
        }
    }

    //出栈
    public int pop() {
        //判断是否栈空
        if (ifEmply()) {
            throw new RuntimeException("栈空,没有数据!");
        } else {
            int value = stack[top];
            top--;
            return value;
        }
    }

    //栈的遍历
    public void list() {
        //判断是否栈空
        if (ifEmply()) {
            System.out.println("栈空,没有数据!");
            return;
        } else {
            for (int i = top; i >= 0; i--) {
                System.out.printf("stack[%d]=%d\n",i,stack[i]);
            }
        }
    }
}
