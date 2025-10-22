import java.util.*;

public class lec_39 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int sp = n - 1; // space count
        int st = 1;     // star count

        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }

            // Print stars
            for (int j = 1; j <= st; j++) {
                System.out.print("*\t");
            }

            // Move to next line
            System.out.println();

            // Update counts for next row
            sp--;
            st++;
        }

        scn.close();
    }
}
