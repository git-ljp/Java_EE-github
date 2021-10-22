/**
 * Created by L.jp
 * Description:
 * User: 86189
 * Date: 2021-10-06
 * Time: 11:41
 */
public class ArrayToString {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        String a = toString(arr);
        System.out.println(a);
    }

    public static String toString(int[] arr) {
        String a = "[";
        for (int i = 0; i < arr.length; i++) {
            a+=arr[i];
            if (i != arr.length - 1) {
                a += ",";
            }
        }
        a += "]";
        return a;
    }
}