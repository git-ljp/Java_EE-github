/**
 * Created by L.jp
 * Description:
 * User: 86189
 * Date: 2021-10-06
 * Time: 10:40
 */
public class SumArray {
    public static int add(int[]arr){
        int sum=0;
        for (int x: arr) {
            sum+=x;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[]arr={2,3,4,5,6,8};
        System.out.println("数组元素之和是："+add(arr));
    }
}
