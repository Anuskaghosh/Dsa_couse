import java.util.*;
public class digit_frequency{
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        int f = getDigitFrequency( n, d );
        System.out.println(f);
    }

public static int getDigitFrequency( long n, long d ){
    int rv = 0;

    while ( n > 0){
        long dig = n % 10;
        n = n /10;
        if (dig == d){
            rv++;

        }
    }
    return rv;
}

}

