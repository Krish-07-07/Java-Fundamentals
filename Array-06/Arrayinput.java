import java.util.Scanner;
public class Arrayinput {
    public static void main(String[] args){
        int arr[] = new int[6];
        Scanner sc = new Scanner(System.in);
        int n = arr.length;
        for(int i = 0 ; i<=n-1;i++){
           System.out.println("Provide input for index" + i);
           arr[i] = sc.nextInt();
           
           }

        System.out.println("your array contains ");
        for(int value :arr){
            System.out.println(value);
        }   
    }
    
}
