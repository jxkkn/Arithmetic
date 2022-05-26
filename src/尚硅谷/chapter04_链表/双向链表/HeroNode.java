package 尚硅谷.chapter04_链表.双向链表;

/**
 * @author pengjiacheng
 * @create 2022-04-19 21:42
 * @description:
 */
public class HeroNode {
    public int id;
    public String name;
    public String nickName;//昵称
    public HeroNode next;//指向下一节点
    public HeroNode pre;//指向前一结点


    public HeroNode(int id, String name, String nickName) {
        this.id = id;
        this.name = name;
        this.nickName = nickName;
    }

    //为了显示方便，我们重写toString
    @Override
    public String toString() {
        return "HeroNode{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}
