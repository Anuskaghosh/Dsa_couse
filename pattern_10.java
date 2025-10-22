import java.util.*;

public class pattern_10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int os = n / 2;  // outer spaces
        int is = -1;     // inner spaces

        for (int i = 1; i <= n; i++) {
            // print outer spaces
            for (int j = 1; j <= os; j++) {
                System.out.print("\t");
            }

            // print first star
            System.out.print("*\t");

            // print inner spaces and second star if not first or last row
            for (int j = 1; j <= is; j++) {
                System.out.print("\t");
            }
            if (i > 1 && i < n) {
                System.out.print("*\t");
            }

            System.out.println();  // move to next line

            // update outer and inner spaces
            if (i <= n / 2) {
                os--;
                is += 2;
            } else {
                os++;
                is -= 2;
            }
        }
    }
}
