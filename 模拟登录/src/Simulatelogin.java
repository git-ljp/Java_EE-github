import java.util.Scanner;

/**
 * Created by L.jp
 * Description:
 * User: 86189
 * Date: 2021-10-04
 * Time: 19:12
 */
public class Simulatelogin {
    public static void guessPassword(){
        Scanner scanner=new Scanner(System.in);
        int count=3;
        while(count!=0){
            System.out.println("请输入你要猜的密码：");
            String password=scanner.nextLine();
            if(password.equals("hello")){
                System.out.println("登录成功！");
                return;
            }else{
                count--;
                System.out.println("你还有"+count+"次机会！");
            }

        }
    }

    public static void main(String[] args) {
        guessPassword();
    }
}
