import java.util.Scanner;

/**
 * Created by L.jp
 * Description://A表示第一个位置，B表示第二个位置，C表示第三个位置
 * User: 86189
 * Date: 2021-10-05
 * Time: 22:50
 */
public class Hanoi {
    public static void hanoi(int n, char A, char B, char C) {
        if (n == 1) {
            move(A, C);
        } else {
            hanoi(n - 1, A, C, B);//步骤1 按ACB数序执行N-1的汉诺塔移动
            move(A, C);             //步骤2   执行最大盘子移动
            hanoi(n - 1, B, A, C);//步骤3 按BAC数序执行N-1的汉诺塔移动
        }
    }

    private static void move(char A, char C) {//执行最大盘子的从A-C的移动
        System.out.println("move:" + A + "--->" + C);
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入有几个盘子：");
        int n=scan.nextInt();
        System.out.println("移动"+n+"个盘子的步骤是：");
        hanoi(n, 'a', 'b', 'c');
    }
}


