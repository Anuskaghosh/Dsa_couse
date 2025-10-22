import java.util.Scanner;
public class take_input{
    public static void main(String[]args){

    Scanner Scn = new Scanner(System.in);

    //int n = Scn.nextInt();

    //for(int i = 0; i<=n; i++){
    //System.out.println(i);
//}
String name = Scn.nextLine();
System.out.println("Hello " + name);
}
}