import java.util.Scanner;

/**
 * Created by L.jp
 * Description:
 * User: 86189
 * Date: 2021-10-05
 * Time: 22:41
 */
public class FrogJump {
    public static int jumpFloor(int n){
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        return jumpFloor(n-1)+jumpFloor(n-2);
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入有几个台阶：");
        int n=scan.nextInt();
        System.out.println("一共有"+jumpFloor(n)+"种跳法");
    }
}
