import java.util.*;
public class Any_Bas_To_Decimal{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int d = getValueInDecimal(n, b);
        System.out.println(d);
    }
    public static int getValueInDecimal(int n, int b){
        int rv = 0;
        int pow = 1;
        while (n > 0){
            int dig = n % 10;
            n = n / 10;
            rv += dig * pow;
            pow *= b;
        }
        return rv;
    }
}