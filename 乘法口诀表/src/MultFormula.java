import java.util.Scanner;

/**
 * Created by L.jp
 * Description:
 * User: 86189
 * Date: 2021-10-04
 * Time: 22:02
 */
public class MultFormula {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for(int i=1;i<=n;i++){
            for (int j = 1; j <=i ; j++) {
                System.out.print(i+"*"+j+"="+i*j+"  ");
            }
            System.out.println();
        }

    }
}
