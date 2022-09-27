package chapter04_链表.单向环形链表;

/**
 * @author pengjiacheng
 * @create 2022-04-20 22:20
 * @description: 约瑟夫问题
 * Josephu问题为：
 * 设编号为1，2，… n的n个人围坐一圈，约定编号为k（1<=k<=n）的人从1开始报数，
 * 数到m的那个人出列，它的下一位又从1开始报数，数到m的那个人又出列，
 * 依次类推，直到所有人出列为止，由此产生一个出队编号的序列。
 */
public class Josephu {
    public static void main(String[] args) {
        //创建单向环形链表
        CircleSingleLinkedList circleSingleLinkedList = new CircleSingleLinkedList();
        circleSingleLinkedList.add(5);
        circleSingleLinkedList.getList();

        //n=5,k=1,m=2时
        circleSingleLinkedList.countBoyNode(1,2,5);
    }
}
