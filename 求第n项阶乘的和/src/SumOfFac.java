import java.util.Scanner;

/**
 * Created by L.jp
 * Description:n表示要求的是几项的阶乘的和
 * User: 86189
 * Date: 2021-10-05
 * Time: 21:46
 */
public class SumOfFac {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int sum=0;
        for (int i =1; i <=n ; i++) {
            int ret=1;
            for(int j=1;j<=i;j++){
                ret*=j;
            }
            sum+=ret;
        }
        System.out.println(sum);

    }
}
