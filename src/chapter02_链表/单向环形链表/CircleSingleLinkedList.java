package chapter02_链表.单向环形链表;

/**
 * @author pengjiacheng
 * @create 2022-04-20 22:25
 * @description: 环形单向链表
 */
public class CircleSingleLinkedList {
    //创建first结点
    private BoyNode first = new BoyNode(-1);
    //添加小孩节点，构成环形链表
    public void add(int nums){
        if (nums < 1){
            System.out.println("nums的值不正确");
            return;
        }
        //辅助指针，帮助创建环形链表
        BoyNode curBoy = null;
        for (int i = 1; i <= nums; i++) {
            //根据编号创建小孩结点
            BoyNode boyNode = new BoyNode(i);
            if (i == 1){
                first = boyNode;
                //构成环
                first.setNext(first);
                //让curBoy指向第一个小孩
                curBoy = first;
            }else {
                curBoy.setNext(boyNode);
                boyNode.setNext(first);
                curBoy = boyNode;
            }
        }
    }

    //遍历当前环形链表
    public void getList(){
        if (first == null){
            System.out.println("链表为空");
            return;
        }
        //辅助指针，帮助遍历环形链表
        BoyNode curBoy = first;
        while (true){
            System.out.println(curBoy);
            if (curBoy.getNext() == first){
                break;
            }
            curBoy = curBoy.getNext();
        }

    }

    /**
     * 根据用户的输入，计算小孩结点出圈顺序
     * @param startID 表示从哪个结点开始数
     * @param countNum 表示数几下
     * @param nums 表示初始结点个数
     */
    public void countBoyNode(int startID,int countNum,int nums){
        if (first == null || startID < 1 || startID > nums){
            System.out.println("参数输入错误");
            return;
        }
        //辅助指针，帮助小孩结点出圈
        BoyNode helper = first;
        //helper应该指向环形链表中最后结点位置
        while (true){
            if (helper.getNext() == first){
                break;
            }
            helper = helper.getNext();
        }
        //报数前，移动到startID处
        for (int i = 0; i < startID-1; i++) {
            first = first.getNext();
            helper = helper.getNext();
        }
        //报数，出圈
        while (true){
            //圈中只有一个结点
            if (helper == first){
                break;
            }
            //helper和first指针移动countNum-1次
            for (int i = 0; i < countNum-1; i++) {
                first = first.getNext();
                helper = helper.getNext();
            }
            System.out.println(first+"出圈");
            //出圈操作
            first = first.getNext();
            helper.setNext(first);
        }
        System.out.println(first+"最后出圈");
    }
}
