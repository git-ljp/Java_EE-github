import java.util.Scanner;

/**
 * Created by L.jp
 * Description:
 * User: 86189
 * Date: 2021-10-05
 * Time: 22:18
 */
public class Maximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入第一个数：");
        int a1 = sc.nextInt();
        System.out.print("请输入第二个数：");
        int a2 = sc.nextInt();
        System.out.print("请输入第三个数：");
        int a3 = sc.nextInt();
        System.out.println("三个数中最大的是：" + max3(a1, a2, a3));
    }

    public static int max3(int n1, int n2, int n3) {
        int m1 = max2(n1, n2);
        return max2(m1, n3);

    }

    private static int max2(int n1, int n2) {
        return n1 > n2 ? n1 : n2;
    }
}
