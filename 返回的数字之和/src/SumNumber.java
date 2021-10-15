import java.util.Scanner;

/**
 * Created by L.jp
 * Description:
 * User: 86189
 * Date: 2021-10-05
 * Time: 23:09
 */
public class SumNumber {
    public static int sum(int a) {
        if (a < 9) {
            return a % 10;
        }
        return a % 10 + sum(a / 10);

    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int n=scan.nextInt();
        System.out.println("数字之为"+sum(n));
    }
}


