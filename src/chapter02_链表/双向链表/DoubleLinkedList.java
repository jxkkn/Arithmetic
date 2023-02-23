package chapter02_链表.双向链表;

/**
 * @author pengjiacheng
 * @create 2022-04-19 21:44
 * @description:
 */
public class DoubleLinkedList {
    /**初始化头节点，不添加数据*/
    private HeroNode head = new HeroNode(0,"","");

    public HeroNode getHead() {
        return head;
    }
    /**遍历链表*/
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
    /**当不考虑编号时，添加节点到单链表*/
    public void add(HeroNode heroNode){
        //创建一个辅助变量temp
        HeroNode temp = head;

        //遍历链表，找到最后
        while (true){
            if (temp.next == null){
                break;
            }
            //temp后移
            temp = temp.next;
        }
        temp.next = heroNode;
        heroNode.pre = temp;
    }

    /**当考虑编号时,添加节点到单链表*/
    public void addByOrder(HeroNode heroNode){
        //创建一个辅助变量temp
        HeroNode temp = head;

        //标志添加的编号是否存在
        boolean flag = false;
        while (true){
            //temp在链表最后
            if (temp.next == null){
                break;
            }
            //位置找到，就在temp之后
            if (temp.next.id > heroNode.id){
                break;
            }else if (temp.next.id == heroNode.id){
                //编号已经存在
                flag = true;
                break;
            }
            //temp后移
            temp = temp.next;
        }
        if (flag){
            System.out.printf("插入的英雄编号%d已存在，不能添加\n",heroNode.id);
        }else {
            //结点插入到temp之后
            heroNode.next = temp.next;
            temp.next = heroNode;
            temp.next.pre = heroNode;
            heroNode.pre = temp;
        }
    }

    /**修改节点信息，但id不可修改*/
    public void update(HeroNode heroNode){
        if (head.next == null){
            System.out.println("链表为空");
            return;
        }
        //根据id属性找到要修改的结点
        //创建一个辅助变量temp
        HeroNode temp = head.next;
        //标志该节点是否存在
        boolean flag = false;
        while (true){
            //已遍历到最后
            if (temp == null){
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

    /**删除节点*/
    public void delete(int id){
        if (head.next == null){
            System.out.println("链表为空");
            return;
        }
        //找到要删除的结点
        //创建一个辅助变量temp
        HeroNode temp = head.next;
        //标志该节点是否存在
        boolean flag = false;
        while (true){
            //已遍历到最后
            if (temp == null){
                break;
            }
            if (temp.id == id){
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag){
            temp.pre.next = temp.next;
            //如果是最后一个结点，就不需要执行下面这句话，否则出现空指针
            if (temp.next != null){
                temp.next.pre = temp.pre;
            }
        } else {
            System.out.println("没找到要删除的节点");
        }
    }

    /**获取节点数（不统计头结点）*/
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
}
