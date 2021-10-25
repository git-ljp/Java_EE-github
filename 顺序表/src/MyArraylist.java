import java.util.Arrays;

/**
 * Created by L.jp
 * Description:
 * User: 86189
 * Date: 2021-10-06
 * Time: 19:47
 */
public class MyArraylist {
    //构造方法用于数组的初始化
    public MyArraylist() {
        this.elem = new int[capacity];
    }

    public int[] elem;
    public int usedsize;
    public static int capacity = 10;

    //判断顺序表是否满了
    public boolean isFull() {
        if (this.usedsize == capacity) {
            return true;
        }
        return false;
    }

    //在pos位置新增元素
    public void add(int pos, int data) {
        //首先判断pos合不合法
        if (pos < 0 || pos > this.usedsize) {
            System.out.println("pos不合法!");
            return;
        }
        //判断是否已经是满了
        if (isFull()) {
            //扩容
            this.elem = Arrays.copyOf(this.elem, 2 * capacity);
            capacity *= 2;
        }
        //pos位置新增元素
        for (int i = this.usedsize - 1; i >= pos; i--) {
            this.elem[i + 1] = this.elem[i];
        }
        this.elem[pos] = data;
        this.usedsize++;
    }

    //打印顺序表
    public void Display() {
        for (int i = 0; i < this.usedsize; i++) {
            System.out.print(this.elem[i] + " ");

        }
        System.out.println();
    }

    public boolean isEmpty() {
        if (this.usedsize == 0) {
            return true;
        }
        return false;
    }

    //判断是否包含某个元素
    public boolean Contains(int toFind) {
        if (isEmpty()) return false;
        for (int i = 0; i < this.usedsize; i++) {
            if (this.elem[i] == toFind) {
                return true;
            }
        }
        return false;
    }

    //查找某个元素对应的位置
    public int Search(int toFind){
        if(isEmpty()){
            return -1;
        }
        for(int i=0;i<this.usedsize;i++){
            if (this.elem[i] == toFind) {
                return i;
            }
        }
        return -1;
    }

    //获取pos位置元素
    public int getPos(int pos){
        if(isEmpty()){
            //return -1;
            throw new RuntimeException("顺序表为空！");
        }
        if(pos<0 || pos>this.usedsize){
            throw new RuntimeException("坐标不合法！");
        }
        return this.elem[pos];
    }

    //获取顺序表长度
    public int Size(){
        return this.usedsize;
    }

    //给pos位置的元素设为value
    public void setPos(int pos,int value){
        if(pos<0 || pos>this.usedsize){
            System.out.println("pos不合法！");
            return;
        }
        if(isEmpty()){
            System.out.println("顺序表为空！");
            return;
        }
        this.elem[pos]=value;
    }

    //删除第一次出现的关键词key
    public void remove(int key){
        if(isEmpty()) return;
        int ret=Search(key);
        if(ret==-1){
            System.out.println("没有你要删除的元素！");
            return;
        }
        for(int i=ret;i<this.usedsize-1;i++){
            this.elem[i]=this.elem[i+1];
        }
        this.usedsize--;
    }

    //清空顺序表
    public void clear(){
        for (int i = 0; i <this.usedsize ; i++) {
            this.elem[i]=0;
        }
        this.usedsize=0;
    }

    //测试
    public static void main(String[] args) {
        MyArraylist myArraylist=new MyArraylist();
        myArraylist.add(0,1);
        myArraylist.add(1,2);
        myArraylist.add(2,3);
        myArraylist.add(3,4);
        myArraylist.Display();
        System.out.println("顺序表长度为"+myArraylist.Size());
        System.out.println(myArraylist.isEmpty());
        System.out.println(myArraylist.isFull());
        System.out.println(myArraylist.Contains(3));
        System.out.println(myArraylist.Search(4));
        System.out.println(myArraylist.getPos(2));
        System.out.println("===========");
        myArraylist.setPos(1,5);
        myArraylist.Display();
        System.out.println("===========");
        myArraylist.remove(5);
        myArraylist.Display();
        System.out.println("===========");
        myArraylist.clear();
        myArraylist.Display();
    }
}
