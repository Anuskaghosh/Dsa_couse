import java.util.Scanner;

public class question_1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();

        // Process each test case
        for (int i = 0; i < t; i++) {
            int n = scn.nextInt();

            int count = 0 ;
            for (int div = 1; div <= n; div++) {
                if (n % div == 0) {
                    count++;
                }
            }

            // Determine if the number is prime
            if (count == 2) {
                System.out.println("prime");
            } else {
                System.out.println("not prime");
            }
        }

    }
}
