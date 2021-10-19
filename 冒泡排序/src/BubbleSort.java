import java.util.Arrays;

/**
 * Created by L.jp
 * Description:
 * User: 86189
 * Date: 2021-10-06
 * Time: 11:18
 */
public class BubbleSort {
    //冒泡排序
    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            boolean flg = true;//假设数组已经是升序
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tmp;
                    flg = false;
                }
            }
            if (flg==true) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 10, 5, 6};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
}
