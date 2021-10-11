import java.util.Scanner;

/**
 * Created by L.jp
 * Description:
 * User: 86189
 * Date: 2021-10-05
 * Time: 21:30
 */
public class Fibonacci {
    //递归实现
    public static int fib(int n){
        if(n==1 || n==2){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }

    //迭代实现
    /*public static int fib2(int n){
        if(n==1 || n==2){
            return 1;
        }
        int f1=1;int f2=1;int f3=0;
        for (int i = 3; i <=n ; i++) {
            f3=f1+f2;
            f1=f2;
            f2=f3;
        }
        return f3;
    }
*/
    public static void main(String[] args) {
        System.out.print("你要求第几个斐波那契数: ");
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        System.out.println("第"+n+"个斐波那契数为: "+fib(n));
    }



}
