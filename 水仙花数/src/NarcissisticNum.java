/**
 * Created by L.jp
 * Description:
 * User: 86189
 * Date: 2021-10-04
 * Time: 17:01
 */
public class NarcissisticNum {
    public static void main(String[] args) {
        for(int n=0;n<=999;n++) {
            int sum=0;
            int tmp =n;
            int count = 0;
            while (tmp != 0) {
                count++;
                tmp /= 10;
            }
            tmp = n;
            while(tmp!=0){
                sum+=Math.pow(tmp%10,count);
                tmp/=10;
            }
            if(sum==n){
                System.out.println(n);
            }
        }
    }
}
