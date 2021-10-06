import java.util.Random;
import java.util.Scanner;

/**
 * Created by L.jp
 * Description:
 * User: 86189
 * Date: 2021-10-04
 * Time: 16:44
 */
public class GuessNum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Random random=new Random(23681);
        int rand=random.nextInt(100)+1;
        System.out.println("猜数字游戏开始！");
        while(true){
            System.out.println("请输入数字：");
            int num=scanner.nextInt();
            if(num==rand){
                System.out.println("猜对了！");
                break;
            }else if(num<=rand){
                System.out.println("猜小了！");

            }else{
                System.out.println("猜大了！");
            }
        }

    }
}
