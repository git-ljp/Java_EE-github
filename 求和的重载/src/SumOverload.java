import java.util.Scanner;

/**
 * Created by L.jp
 * Description:
 * User: 86189
 * Date: 2021-10-05
 * Time: 22:35
 */
public class SumOverload {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入两个整数：");
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println("两个整数的和是" + add(a, b));
        System.out.println("请输入三个小数：");
        double i = scan.nextDouble();
        double j = scan.nextDouble();
        double k = scan.nextDouble();
        System.out.println("三个小数的和是" + add(i, j, k));
    }
    public static int add(int a, int b) {
        return a + b;
    }
    public static double add(double i, double j, double k) {
        return i + j + k;
    }

}
