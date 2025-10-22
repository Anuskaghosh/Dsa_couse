import java.util.*;

public class rotate {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); // Input the number to rotate
        int k = scn.nextInt(); // Input the rotation count
        scn.close();

        int temp = n;
        int nod = 0; // Number of digits
        while (temp > 0) {
            temp = temp / 10;
            nod++;
        }

        // Handle rotation count greater than number of digits and negative rotations
        k = k % nod;
        if (k < 0) {
            k = k + nod;
        }

        int div = 1;
        int mult = 1;

        for (int i = 1; i <= nod; i++) {
            if (i <= k) {
                div = div * 10; // Divider for rotation
            } else {
                mult = mult * 10; // Multiplier for rotation
            }
        }

        int q = n / div; // Quotient
        int r = n % div; // Remainder

        int rotatedNumber = r * mult + q; // Combine parts to get the rotated number
        System.out.println(rotatedNumber); // Output the rotated number
    }
}
