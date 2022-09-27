package chapter03_稀疏数组和队列.数组模拟队列;

/**
 * @author pengjiacheng
 * @create 2022-03-23 21:27
 * @description: 数组模拟队列
 */
public class ArrayQueue {
    private int maxSize;//表示数组的最大容量
    private int front;//队列头
    private int rear;//队列尾
    private int[] arr;

    //创建队列的构造器
    public ArrayQueue(int maxSize) {
        this.maxSize = maxSize;
        arr = new int[maxSize];
        front = -1;//指向队列头前一个位置
        rear = -1;//指向队列尾的数据
    }

    //判断队列是否满
    public boolean isFull(){
        return rear == maxSize-1?true:false;
    }

    //判断队列是否空
    public boolean isEmpty(){
        return rear == front?true:false;
    }

    //数据入队
    public void addQueue(int n){
        if (isFull()){
            System.out.println("队列已满，入队失败！");
        }else {
            arr[++rear] = n;
        }
    }

    //数据出队
    public int getQueue(){
        if (isEmpty()){
            throw new RuntimeException("队列已空，出队失败！");
        }else {
            return arr[++front];
        }
    }

    //显示队列的所有数据
    public void showQueue(){
        if (isEmpty()){
            System.out.println("队列已空");
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d]=%d\n",i,arr[i]);
        }
    }

    //显示队列的头数据
    public int headQueue(){
        if (isEmpty()){
            throw new RuntimeException("队列已空");
        }else {
            return arr[front+1];
        }
    }
}
