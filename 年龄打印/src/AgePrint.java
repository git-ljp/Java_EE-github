import java.util.Scanner;

/**
 * Created by L.jp
 * Description:
 * User: 86189
 * Date: 2021-10-04
 * Time: 14:00
 */
public class AgePrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n <= 18) {
            System.out.println("少年");
        } else if (n <= 28) {
            System.out.println("青年");
        } else if (n <= 55) {
            System.out.println("中年");
        } else {
            System.out.println("老年");
        }
    }
}
