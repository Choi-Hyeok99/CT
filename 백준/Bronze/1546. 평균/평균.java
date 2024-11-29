import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        double sum = 0;
        double max = 0;

        for ( int i = 0 ; i < M ; i++) {
            int num = sc.nextInt();
            if (num > max) {
                max = num;
            }
            sum += num;
        }
        sc.close();
        System.out.println(((sum/max)*100)/M);
    }
}
