import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;

/**
 * Created by L.jp
 * Description:
 * User: 86189
 * Date: 2021-10-05
 * Time: 22:06
 */
public class Sequencing {
        public static void sortOddEven(int[] array){
            int left=0;
            int right=array.length-1;
            while (left<right){
                while (array[left]%2==0&&left<right){
                    left++;
                }
                while (array[right]%2!=0&&left<right){
                    right--;
                }
                if (left<right) {
                    int temp=array[left];
                    array[left]=array[right];
                    array[right]=temp;
                }
            }
        }
        public static void main(String[] args) {
            int[] arr={2,3,1,6,7};
            System.out.println(Arrays.toString(arr));
            sortOddEven(arr);
            System.out.println(Arrays.toString(arr));
        }
    }


