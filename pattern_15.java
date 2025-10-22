import java.util.*;

public class pattern_15 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sp = n / 2;
        int st = 1;
        int val = 1;

        for (int i = 1; i <= n; i++) {
            // print spaces
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }

            // print values
            for (int j = 1; j <= st; j++) {
                System.out.print(val + "\t");  // changed println to print
            }

            System.out.println();  // move to next line after printing a row

            // update variables
            if (i <= n / 2) {
                sp--;
                st += 2;
            } else {
                sp++;
                st -= 2;
            }
            val++;
        }

        scn.close();
    }
}
