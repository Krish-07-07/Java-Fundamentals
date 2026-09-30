import java.sql.SQLOutput;
import java.util.Scanner;

public class HWloop {
    void main () {
//        System.out.println("PROGRAM TO TYPE FROM 1 to N");
//       Scanner sc = new Scanner(System.in);
//        System.out.println("Enter how much you want to count : ");
//        int n = sc.nextInt();
//        for (int i = 1 ; i <= n ; i++){
//            System.out.println(i);
//        }
//    }
//        System.out.println("PROGRAM TO TYPE FROM N to 1");
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter how much you want to count : ");
//        int n = sc.nextInt();
//        for (int i = n ; i >= 1 ; i--){
//            System.out.println(i);
//        }
//    }
//        System.out.println("PROGRAM TO FIND THE 10 MULTIPLE OF N NUMBER");
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number to find the multiple :");
//        int n = sc.nextInt();
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(i * n);
//        }
//        System.out.println("PROGRAM TO PRINT MY NAME 100 TIMES");
//        Scanner sc = new Scanner(System.in);
//        System.out.println("ENTER YOUR NAME :");
//        String name = sc.nextLine();
//        for (int i = 1 ; i <= 100 ; i++) {
//            System.out.println(i + " " + name);
//        }

//        for (int num = 2; num <= 100; num++) {
//            boolean isPrime = true;   // assume prime
//
//            for (int i = 2; i <= num / 2; i++) {
//                if (num % i == 0) {
//                    isPrime = false;  // found divisor
//                    break;
//                }
//            }
//
//            if (isPrime) {
//                System.out.println(num + " ");
//            }
//        }

//        System.out.println("PROGRAM TO PRINT EVEN NUMBER FROM 1 to 100");
//        for (int i = 0 ; i<=100 ; i+=2){
//            System.out.println(i +" ");
//        }

//        System.out.println("PROGRAM TO FIND THE SUM OF N NUMBERS");
//        Scanner input = new Scanner (System.in);
//        System.out.println("Enter the no of terms you want to add ");
//        int n= input.nextInt();
//        int sum = 0;
//        for (int i = 1; i<=n ; i++) {
//            sum = sum + i;
//        }
//        System.out.println("The sum is " + sum);

        System.out.println("PERFECTLY DIVISIBLE INTEGER FROM 7 BETWEEN 50 to 100 ");
        for (int i =50 ; i<=100 ; i++){
            if (i % 7 == 0){
                System.out.println(i);
            }
        }















    }
}