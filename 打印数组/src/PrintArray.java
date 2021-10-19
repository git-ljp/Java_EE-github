/**
 * Created by L.jp
 * Description:
 * User: 86189
 * Date: 2021-10-06
 * Time: 10:53
 */
public class PrintArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        printarray(arr);
    }

    public static void printarray(int a[]) {
        for (int x : a) {
            System.out.print(x+" ");
        }
    }
}
