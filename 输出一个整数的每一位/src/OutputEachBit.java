import java.util.Scanner;

/**
 * Created by L.jp
 * Description:
 * User: 86189
 * Date: 2021-10-04
 * Time: 19:23
 */
public class OutputEachBit {
    public static void Print(int n) {
        if (n > 9) {
            Print(n / 10);
        }
        System.out.print(n % 10 + " ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Print(n);


    }
}


