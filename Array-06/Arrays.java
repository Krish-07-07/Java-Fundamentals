import java.util.Scanner;
public class Arrays {

    
    public static void main(String[] args){
        
        //declaration 

    //     int arr[];

    //     //allocation 

    //     arr = new int [5];

    //     //init
    //    int brr[] ={10,3,4};
    //    int n = brr.length;
    // //    for(int index = 0 ; index<=n-1;index++)
    // //    System.out.println(brr[index]);
    //    for(int value:brr);
    //    System.out.println(val);
    
// print array value 

    // int arr[] = new int[5];
    // Scanner sc = new Scanner(System.in);
    // int n  = arr.length;

    // for(int i = 0 ; i<=n-1 ; i++){
    //     System.out.println("Enter the element at index" + i);
    //     arr [i] = sc.nextInt();
    // }

    // System.out.println("your array contain");
    // for(int val :arr){
    //     System.out.println(val);
    // }

//sum of array 

    // int arr[] = {5,45,10,23,45,45};
    // int sum = 0;
    // int n = arr.length;

    // for(int i = 0 ; i<=n-1 ;i++){
    //     int value = arr[i];
    //     sum = sum+value;
    // }

    // System.out.println(sum);

    // multiplication of array 

    int arr[] = {10,20,30,40};
    int ans = 1 ;
    int n = arr.length;

    for(int i = 0 ; i<=n-1 ;i++){
        int value = arr[i];
        ans = value*ans;
    }

    System.out.println(ans);
    
    




       
    }
    
}

