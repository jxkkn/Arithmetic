package 尚硅谷.chapter04_链表.单向环形链表;

/**
 * @author pengjiacheng
 * @create 2022-04-20 22:23
 * @description:
 */
public class BoyNode {
    private int id;
    private BoyNode next;

    public BoyNode(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BoyNode getNext() {
        return next;
    }

    public void setNext(BoyNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "BoyNode{" +
                "id=" + id +
                '}';
    }
}
