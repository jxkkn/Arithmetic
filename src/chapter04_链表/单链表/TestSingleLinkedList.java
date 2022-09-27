package chapter04_链表.单链表;

/**
 * @author pengjiacheng
 * @create 2022-03-26 15:49
 * @description:
 */
public class TestSingleLinkedList {
    public static void main(String[] args) {
        //创建节点
        HeroNode hero1 = new HeroNode(1, "宋江", "及时雨");
        HeroNode hero2 = new HeroNode(2, "卢俊义", "玉麒麟");
        HeroNode hero3 = new HeroNode(3, "吴用", "智多星");
        HeroNode hero4 = new HeroNode(4, "林冲", "豹子头");

        //创建链表
        SingleLinkedList sld = new SingleLinkedList();

        //不按编号添顺序加
//        sld.add(hero1);
//        sld.add(hero2);
//        sld.add(hero3);
//        sld.add(hero4);

        //按编号顺序添加
        sld.addByOrder(hero1);
        sld.addByOrder(hero4);
        sld.addByOrder(hero3);
        sld.addByOrder(hero2);

        //遍历输出
        sld.getList();

        System.out.println("--------------------------");
        //修改链表结点
        HeroNode heroNode = new HeroNode(2, "小卢", "玉麒麟~");
        sld.update(heroNode);
        sld.getList();

        System.out.println("--------------------------");
        //删除链表结点
        sld.delete(2);
        sld.getList();

        System.out.println("--------------------------");
        //单链表中有效结点个数
        int length = sld.getLength(sld.getHead());
        System.out.println("单链表中有效结点个数为："+length);

        System.out.println("--------------------------");
        //查找单链表中倒数第K个结点
        HeroNode node = sld.getLastIndexHeroNode(sld.getHead(), 1);
        System.out.println("倒数第一个结点是：" + node);

        System.out.println("--------------------------");
        //将链表进行反转
        System.out.println("将链表进行反转：");
        sld.reversetList(sld.getHead());
        sld.getList();

        System.out.println("--------------------------");
        //从尾到头打印单链表：利用栈
        System.out.println("从尾到头打印单链表：");
        sld.reversePrint(sld.getHead());

    }
}
