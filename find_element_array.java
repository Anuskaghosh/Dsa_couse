import java.util.*;
public class find_element_array{


public static void main (String [] args){
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] arr = new int[n];
    for (int i = 0 ; i< arr.length; i++){
        arr[i] = scanner.nextInt();
    }
    int data = scanner.nextInt();

int idx = -1;
for(int i = 0; i< arr.length; i++){
    if(arr[i]== data){
        idx = i;
        break;
    }
}
System.out.println(idx);
}
}