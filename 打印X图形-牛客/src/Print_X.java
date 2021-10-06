import java.util.Scanner;

/**
 * Created by L.jp
 * Description:
 * User: 86189
 * Date: 2021-10-04
 * Time: 14:16
 */
public class Print_X {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNextInt()){
            int n=scanner.nextInt();
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(i==j || j==n-1-i){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }

        }

    }
}

