/**
 * Created by L.jp
 * Description:
 * User: 86189
 * Date: 2021-10-04
 * Time: 17:55
 */
public class Count {
    public static void main(String[] args) {
        double sum = 0.0;
        int flag = 1;
        for (int i = 1; i <= 100; i++) {
            sum += (flag)*1.0 / i;
            flag = -flag;
        }
        System.out.println(sum);
    }
}

