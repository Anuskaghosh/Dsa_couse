
import java.util.Scanner;

public class Pythagorean {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter three numbers:");
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();

        int max = a;
        if (b >= max) {
            max = b;
        }
        if (c >= max) {
            max = c;
        }

        boolean flag;

        if (max == a) {
            flag = (b * b + c * c) == (a * a);
        } else if (max == b) {
            flag = (a * a + c * c) == (b * b);
        } else {
            flag = (a * a + b * b) == (c * c);
        }

        System.out.println("Is Pythagorean Triplet? " + flag);

        scn.close();
    }
}
