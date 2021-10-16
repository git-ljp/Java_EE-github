import java.util.Scanner;

/**
 * Created by L.jp
 * Description:
 * User: 86189
 * Date: 2021-10-05
 * Time: 23:35
 */
public class RecSum {
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        int ret=n+sum(n-1);
        return ret;
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入项数：");
        int n=scan.nextInt();
        System.out.println(n+"项的和是"+sum(n));
    }
}
