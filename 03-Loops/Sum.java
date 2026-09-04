import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        // Scanner sc = new Scanner(System.in);

        // System.out.println("Enter the number of terms till you want to find the sum:");
        // int n = sc.nextInt();

        // int sum = 0;

        // for (int i = 1; i <= n; i++) {
        //     sum = sum + i;
        // }

        // System.out.println("Sum: " + sum);

           Scanner sc = new Scanner(System.in);

           System.out.println("Enter the number you want to print :");
           int n = sc.nextInt();

           int count = 0;

            for (int i= 2 ; i <=n ; i++ ){
            if (i % 2 == 0){
                count ++;
                
            }
                
            }
            System.out.println("Even no " + count);
                
           }

    }
