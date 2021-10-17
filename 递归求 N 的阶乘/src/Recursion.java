/**
 * Created by L.jp
 * Description:
 * User: 86189
 * Date: 2021-10-05
 * Time: 23:43
 */
public class Recursion {
    public static void main(String[] args) {
        int a = 6;
        System.out.println("6的阶乘是"+fac(a));
    }

    public static int fac(int num) {
        if (num <= 1) {
            return 1;
        } else {
            return num * fac(num - 1);
        }
    }
}


