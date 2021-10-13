import java.util.Scanner;

/**
 * Created by L.jp
 * Description:
 * User: 86189
 * Date: 2021-10-05
 * Time: 22:22
 */
public class MaxOverload {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("请输入两个整数:");
            int a = scan.nextInt();
            int b = scan.nextInt();
            System.out.println("两个整数中最大的是："+max(a,b));
            System.out.println("请输入两个小数:");
            double i = scan.nextDouble();
            double j = scan.nextDouble();
            System.out.println("两个小数中最大的是："+max(i,j));
            System.out.println("请输入两个小数和一个整数:");
            double x = scan.nextDouble();
            double y = scan.nextDouble();
            int k = scan.nextInt();
            System.out.println("两个小数和一个整数中最大的是："+max(i,j,k));
        }
        public static int max(int a,int b) {
            return a>b?a:b;
        }
        public static double max(double i,double j) {
            return i>j?i:j;
        }
        public static double max (double i,double j,int k) {
            return max(max(i,j),k);
        }

    }
