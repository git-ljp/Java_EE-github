import java.util.Scanner;

public class Count_nine {
    public static int func(int n) {
        int count=0;
        for (int i = 1; i <= n; i++) {
            if (i % 10 == 9) {
                count++;
            }
            if (i / 10 == 9) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        System.out.println(func(n));

    }
}
