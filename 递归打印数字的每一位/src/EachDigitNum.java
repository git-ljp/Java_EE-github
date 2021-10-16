import java.util.Scanner;

/**
 * Created by L.jp
 * Description:
 * User: 86189
 * Date: 2021-10-05
 * Time: 23:22
 */
public class EachDigitNum {
        public static void main(String[] args) {
            System.out.println("输入数字：");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            System.out.println("每一位数字为：");
            fun(n);
        }
        public static void fun(int n) {
            if (n > 9) {
                fun(n / 10);
            }
            System.out.print(" "+n % 10+" ");

        }
}



