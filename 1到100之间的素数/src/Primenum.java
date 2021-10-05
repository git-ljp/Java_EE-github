/**
 * Created by L.jp
 * Description:
 * User: 86189
 * Date: 2021-10-04
 * Time: 10:26
 */
public class Primenum {
    public static void main(String[] args) {
        {
            int count=0;
            for(int i=2;i<100;i++){
                int j=0;
                for(j=2;j<=Math.sqrt(i);j++){
                    if(i%j==0){
                        break;
                    }
                }
                if(j>Math.sqrt(i)){
                    System.out.println(i+" ");
                    count++;
                }
            }
            System.out.println("1到100共有"+count+"个素数");
        }
    }
}