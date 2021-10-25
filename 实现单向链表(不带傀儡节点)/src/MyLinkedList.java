/**
 * Created by L.jp
 * Description:
 * User: 86189
 * Date: 2021-10-06
 * Time: 22:41
 */
class Node{
    public int val;
    public Node next;

    public Node(int val) {
        this.val = val;
    }
}
public class MyLinkedList {
    public Node head;//标识链表的头
    //先用穷举法创建单链表
    public void createList(){
        Node node1=new Node(12);
        Node node2=new Node(3);
        Node node3=new Node(5);
        Node node4=new Node(2);
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        this.head=node1;
    }

    //打印单链表
    public void show() {
        //定义cur节点遍历链表
        Node cur=this.head;
        while(cur!=null){
            System.out.println(cur.val+" ");
            cur=cur.next;
        }
        System.out.println();
    }

    //得到链表的长度(节点的个数）
    public int size(){
        Node cur=this.head;
        int count=0;
        while(cur!=null){
            count++;
            cur=cur.next;
        }
        return count;
    }

    //查看是否包含关键字key在链表中
    public boolean contains(int key){
        Node cur=this.head;
        while(cur!=null){
            if(cur.val==key){
                return true;
            }
            cur=cur.next;
        }
        return false;
    }

    //头插法插入一个节点
    public void addFirst(int data){
        //创建要插入的节点
        Node node=new Node(data);
        if(this.head==null){
            this.head=node;
        }else{
            //先绑后面，再把头往前移
            node.next=this.head;
            this.head=node;
        }
    }

    //尾插法
    public void addLast(int data){
        Node node=new Node(data);
        if(this.head==null){
            this.head=node;
        }else{
            //尾巴节点特征是next域为null,所以要先找到尾巴节点
            //定义一个cur节点去找尾巴节点
            Node cur=this.head;
            while(cur.next!=null){
                cur=cur.next;
            }
            cur.next=node;
        }
    }

    //任意位置插入，第一个节点为0下标
    //先找到要插入节点的前一个节点
    public Node searchPrev(int index){
        Node cur=this.head;
        int count=0;
        while(count!=index-1){
            cur=cur.next;
            count++;
        }
        return cur;
    }
    public void addIndex(int index,int data){
        if(index<0 || index>size()){
            System.out.println("下标不合法！");
            return;
        }
        if(index==0){
            //头插
            addFirst(data);
            return;
        }
        if(index==size()){
            addLast(data);
            return;
        }
        Node cur=searchPrev(index);//找到的前驱节点
        Node node=new Node(data);//要插入的节点
        node.next=cur.next;//先绑后面
        cur.next=node;
    }

    //删除第一次出现关键字为key的节点
    //要删除含有key的节点，首先要先找到key节点的前一个节点，找到后直接跳过key的节点
    public Node searchPrevNode(int key){
        Node cur=this.head;
        while(cur.next!=null){//只需要让cur走到尾巴节点，如果是cur!=null的话，那么cur.next==null时，val值没有，会报异常
            if(cur.next.val==key){
                return cur;//是key的前一个节点
            }
            cur=cur.next;

        }
        return null;
    }
    public void remove(int key){
        if(this.head==null){
            return;
        }
        if(this.head.val==key){//单独判断头结点
            this.head=this.head.next;
            return;
        }
        Node cur=searchPrevNode(key);
        if(cur==null){
            System.out.println("没有你要删除的节点！");
            return;
        }
        Node del=cur.next;//这就是要删除的节点
        cur.next=del.next;//跳过要删除的节点
    }

    //删除所有值为key的节点
    //方法：1.定义一个prev前驱让prev和cur相差一个节点 2.如果是要删除的节点，那么prev.next=cur.next,跟删除一个key的方法一样
    public void removeAllkey(int key){
        if(this.head==null){
            return;
        }
        Node prev=this.head;
        Node cur=this.head.next;
        while(cur!=null){
            if(cur.val==key){
                prev.next=cur.next;
                cur=cur.next;
            }else{
                prev=cur;
                cur=cur.next;
            }
        }
        //判断头节点
        if(this.head.val==key){
            this.head=this.head.next;
        }
    }

    //清空链表,让所有节点的next域为null
    public void clear(){
        while(this.head!=null){
            //不能直接写this.head.next=null,不然下一步走不了，所以必须创建一个节点来记录head的下一个节点
            Node curNext=this.head.next;
            this.head.next=null;
            this.head=curNext;
        }
    }

    //测试
    public static void main(String[] args) {
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.createList();
        System.out.println("打印链表：");
        myLinkedList.show();
        System.out.println("打印链表长度：");
        System.out.println(myLinkedList.size());
        System.out.println("查看链表是否包含12：");
        System.out.println(myLinkedList.contains(12));
        System.out.println("删除关键字1,");
        myLinkedList.remove(1);
        System.out.println("打印删除1之后的链表：");
        myLinkedList.show();
        System.out.print("在1下标插入3,");
        myLinkedList.addIndex(1,3);
        System.out.println("插入3后新的链表为：");
        myLinkedList.show();
        myLinkedList.removeAllkey(3);
        System.out.println("删除所有的3：");
        myLinkedList.show();
        myLinkedList.addLast(4);
        System.out.println("尾插法插入4：");
        myLinkedList.show();
        System.out.println("清空链表！");
        myLinkedList.clear();
        System.out.println("长度为"+myLinkedList.size());
    }
}
