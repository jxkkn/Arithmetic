package 尚硅谷.chapter04_链表.单链表;

import java.util.Stack;

/**
 * @author pengjiacheng
 * @create 2022-03-26 15:46
 * @description: 管理HeroNode
 */
public class SingleLinkedList {
    //初始化头节点，不添加数据
    private HeroNode head = new HeroNode(0,"","");

    public HeroNode getHead() {
        return head;
    }

    //添加节点到单链表
    /*
    当不考虑编号时，先找到尾节点，将尾结点的next指向新的结点
     */
    public void add(HeroNode heroNode){
        //创建一个辅助变量temp
        HeroNode temp = head;

        //遍历链表，找到最后
        while (true){
            if (temp.next == null){
                break;
            }
            temp = temp.next;
        }

        temp.next = heroNode;
    }

    //添加节点到单链表
    /*
    当考虑编号时
     */
    public void addByOrder(HeroNode heroNode){
        //创建一个辅助变量temp
        HeroNode temp = head;

        //遍历链表
        boolean flag = false;//标志添加的编号是否存在
        while (true){
            if (temp.next == null){//temp在链表最后
                break;
            }
            if (temp.next.id > heroNode.id){//位置找到，就在temp之后
                break;
            }else if (temp.next.id == heroNode.id){
                flag = true;//编号已经存在
                break;
            }
            temp = temp.next;//temp后移
        }
        if (flag){
            System.out.printf("插入的英雄编号%d已存在，不能添加\n",heroNode.id);
        }else {
            //结点插入到temp之后
            heroNode.next = temp.next;
            temp.next = heroNode;
        }
    }

    //修改节点信息，但id不可修改
    public void update(HeroNode heroNode){
        if (head.next == null){
            System.out.println("链表为空");
            return;
        }
        //找到要修改的结点
        //创建一个辅助变量temp
        HeroNode temp = head.next;
        boolean flag = false;//标志该节点是否存在
        while (true){
            if (temp == null){//已遍历到最后
                break;
            }
            if (temp.id == heroNode.id){
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag){
            temp.name = heroNode.name;
            temp.nickName = heroNode.nickName;
        } else {
            System.out.println("没找到要修改的节点");
        }
    }

    //删除节点
    public void delete(int id){
        if (head.next == null){
            System.out.println("链表为空");
            return;
        }
        //找到要删除的结点
        //创建一个辅助变量temp
        HeroNode temp = head;
        boolean flag = false;//标志该节点是否存在
        while (true){
            if (temp.next == null){//已遍历到最后
                break;
            }
            if (temp.next.id == id){
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag){
            temp.next = temp.next.next;
        } else {
            System.out.println("没找到要删除的节点");
        }
    }

    //遍历链表
    public void getList(){
        if (head.next == null){
            System.out.println("链表为空");
            return;
        }
        //创建一个辅助变量temp
        HeroNode temp = head.next;

        while (true){
            if (temp == null){
                break;
            }
            //输出结点信息
            System.out.println(temp);
            temp = temp.next;
        }
    }

    //获取节点数（不统计头结点）
    public int getLength(HeroNode head){
        if (head.next == null){
            return 0;
        }
        int length = 0;
        //创建一个辅助变量temp
        HeroNode temp = head.next;
        while (temp != null){
            length++;
            temp = temp.next;
        }
        return length;
    }

    //查找单链表中倒数第K个结点
    public HeroNode getLastIndexHeroNode(HeroNode head,int index){
        if (head.next == null){
            return null;
        }
        int length = getLength(head);
        //创建一个辅助变量temp
        if (index <=0 && index>=length){
            return null;
        }
        HeroNode temp = head.next;
        for (int i = 0; i < length-index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    //将链表进行反转
    public void reversetList(HeroNode head){
        if (head.next == null){
            System.out.println("链表为空");
            return;
        }
        HeroNode reverdeHead = new HeroNode(0, "", "");
        //创建一个辅助变量temp
        HeroNode temp = head.next;
        //保留当前结点的next
        HeroNode next = null;

        while (temp != null){
            next = temp.next;
            temp.next = reverdeHead.next;
            reverdeHead.next = temp;
            temp =next;
        }
        head.next = reverdeHead.next;
    }

    //从尾到头打印单链表：利用栈
    public void reversePrint(HeroNode head){
        if (head.next == null){
            System.out.println("链表为空");
            return;
        }
        Stack<HeroNode> stack = new Stack<>();
        HeroNode temp = head.next;
        //将链表结点入栈
        while (temp != null){
            stack.push(temp);
            temp = temp.next;
        }
        while (stack.size() > 0){
            System.out.println(stack.pop());
        }
    }

    //合并两个有序单链表
    public static HeroNode mergeLinkedList(HeroNode head1, HeroNode head2) {
        if (head1 == null && head2 == null) {
            return null;
        }
        if (head1 == null) {
            return head2;
        }
        if (head2 == null) {
            return head1;
        }
        //创建一个新的头节点
        HeroNode head = null;
        if (head1.id < head2.id) {
            head = head1;
            head.next = mergeLinkedList(head1.next, head2);
        } else {
            head = head2;
            head.next = mergeLinkedList(head1, head2.next);
        }
        return head;
    }
}

