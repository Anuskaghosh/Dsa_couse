import java.util.*;

public class lec_41{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sp = 0;
        int st = n; // star count
        for(int i = 1; i <= n;i++){
            for(int j = 1; j<= sp; j++){
                System.out.print("\t");
            }
            // Print stars
            for(int j = 1; j <=st;j++){
                System.out.print("*\t");
            }
            // Print numbers
            System.out.print(sp +", "+ st);
            sp++;
            st--;
            // Print spaces
            System.out.println();

        }
    }
}