import java.util.Scanner;

/**
 * Created by L.jp
 * Description:
 * User: 86189
 * Date: 2021-10-04
 * Time: 18:57
 */
public class Binarysequence {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        System.out.println("奇数位序列：");
        for(int i=30;i>=0;i-=2){
            System.out.print(((n>>i)&1)+" ");
        }
        System.out.println();
        System.out.println("偶数位序列：");
        for(int j=31;j>=1;j-=2){
            System.out.print(((n>>j)&1)+" ");
        }

    }
}
