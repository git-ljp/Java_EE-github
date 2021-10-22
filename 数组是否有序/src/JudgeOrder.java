/**
 * Created by L.jp
 * Description:
 * User: 86189
 * Date: 2021-10-06
 * Time: 11:24
 */
public class JudgeOrder {
    public static boolean issorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {//之所以是arr.length是为了避免越界,防止最后一个元素比较时越界
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 41, 5, 6};
        System.out.println(issorted(arr));
    }

}
