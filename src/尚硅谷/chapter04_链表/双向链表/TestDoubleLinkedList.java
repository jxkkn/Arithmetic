package 尚硅谷.chapter04_链表.双向链表;

/**
 * @author pengjiacheng
 * @create 2022-04-19 21:43
 * @description:
 */
public class TestDoubleLinkedList {
    public static void main(String[] args) {
        //创建节点
        HeroNode hero1 = new HeroNode(1, "宋江", "及时雨");
        HeroNode hero2 = new HeroNode(2, "卢俊义", "玉麒麟");
        HeroNode hero3 = new HeroNode(3, "吴用", "智多星");
        HeroNode hero4 = new HeroNode(4, "林冲", "豹子头");

        //创建双向链表
        DoubleLinkedList doubleLinkedList  = new DoubleLinkedList();
        
        doubleLinkedList.addByOrder(hero1);
        doubleLinkedList.addByOrder(hero2);
        doubleLinkedList.addByOrder(hero3);
        doubleLinkedList.addByOrder(hero4);
        doubleLinkedList.getList();

        System.out.println("--------------------------");
        //修改链表结点
        HeroNode heroNode = new HeroNode(2, "小卢", "玉麒麟~");
        doubleLinkedList.update(heroNode);
        doubleLinkedList.getList();

        System.out.println("--------------------------");
        //删除链表结点
        doubleLinkedList.delete(2);
        doubleLinkedList.getList();

        System.out.println("--------------------------");
    }
}
