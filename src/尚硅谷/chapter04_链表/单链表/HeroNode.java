package 尚硅谷.chapter04_链表.单链表;

/**
 * @author pengjiacheng
 * @create 2022-03-26 15:41
 * @description: 单链表结点
 */
public class HeroNode {
    public int id;
    public String name;
    public String nickName;//昵称
    public HeroNode next;

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
