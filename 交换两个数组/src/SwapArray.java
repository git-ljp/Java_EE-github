import java.util.Arrays;

/**
 * Created by L.jp
 * Description:
 * User: 86189
 * Date: 2021-10-06
 * Time: 14:11
 */
public class SwapArray {
    public static void swap(int[] array1, int[] array2) {
        int tmp = 0;
        for (int i = 0; i < array1.length; i++) {
            tmp = array1[i];
            array1[i] = array2[i];
            array2[i] = tmp;
        }
    }

    public static void main(String[] args) {
        int[] array1 = {1, 3, 5, 7};
        int[] array2 = {2, 4, 6, 8};
        System.out.println("交换前array1:" + Arrays.toString(array1));
        System.out.println("交换前array2:" + Arrays.toString(array2));
        System.out.println("=========================");
        swap(array1, array2);
        System.out.println("交换后array1:" + Arrays.toString(array1));
        System.out.println("交换后array2:" + Arrays.toString(array2));
    }
}

