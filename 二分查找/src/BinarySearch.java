import java.util.Scanner;

/**
 * Created by L.jp
 * Description:
 * User: 86189
 * Date: 2021-10-06
 * Time: 11:31
 */
public class BinarySearch {
    public static int binarySearch(int[]arr,int key) {
        int left = 0;
        int right = arr.length-1;
        while(left<=right) {
            int mid = (left+right)/2;
            if(key<arr[mid]) {
                right=mid-1;
            }
            else if(key>arr[mid]) {
                left=mid+1;
            }
            else{
                return mid;//打印下标
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int []arr = new int []{1,2,3,4,5,6,7,8};
        System.out.println("请输入你要查找的元素：");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("他的下标是：");
        System.out.println(binarySearch(arr,n));
    }
}
