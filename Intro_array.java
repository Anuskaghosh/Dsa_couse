public class Intro_array {
    public static void swap(int [] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) throws Exception{
        int[] arr ;
        arr = new int[5];
        arr[0]= 33;
        arr[1]= 44;
        arr[2]= 55;         
        arr[3]= 66;
        arr[4]= 77;

       swap(arr, 0 , 4);
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        //System.out.println(arr.length);
    }

}