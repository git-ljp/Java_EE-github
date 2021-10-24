import java.util.Arrays;

/**
 * Created by L.jp
 * Description:
 * User: 86189
 * Date: 2021-10-06
 * Time: 14:08
 */
public class EvenOdd {
    public static int[] Even_Odd(int[] a) {
        int left = 0;
        int right = a.length - 1;
        while (left < right) {
            while ((left < right) && a[right] % 2 != 0)//从右边开始找一个偶数
            {
                right--;
            }
            while ((left < right) && a[left] % 2 == 0)//从左边开始找一个奇数
            {
                left++;
            }
            if (left < right)//基于上面两个循环找出来的奇数与偶数，
            // 若left<right，则交换两个数
            {
                int tmp = a[right];
                a[right] = a[left];
                a[left] = tmp;
            }
        }
        return a;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(Even_Odd(arr)));
    }
}


