/**
 * Created by L.jp
 * Description:使用异或运算的思想，相同的两个数异或为0,
 * User: 86189
 * Date: 2021-10-04
 * Time: 22:56
 */
public class FindOnce {
    public static void main(String[] args) {
        int[] array = {1, 1, 2, 2, 3, 3, 4};
        int ret = 0;
        for (int i = 0; i < array.length; i++) {
            ret ^= array[i];
        }
        System.out.println(ret);
    }
}