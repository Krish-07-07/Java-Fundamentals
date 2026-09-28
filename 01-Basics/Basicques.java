public class Basicques {
  
    // Print each digit 

    static void printDigit(int num){
        while(num != 0){
            int digit = num % 10;
            System.out.println(digit);
            num = num/10;
        }
    }
     
    // Print no of digits 

    static int countDigit(int num){
        int count =0;
        while(num!=0){
            int digit = num%10;
            count++;
            num = num/10;
        }
        return count;
    }

    //sum of digits 

    static int sumOfDigit(int num){
        int sum = 0;
        while(num!=0){
            int digit = num%10;
            sum = sum+digit;
            num = num/10;
        }
        return sum;
    }

    //reverse a number 

    static int reverseNum(int num){
        int revNum = 0;
        while(num != 0){
            int digit = num%10;
            revNum = revNum*10+digit;
            num = num/10;
        }
        return revNum;
    }
    
    // Palindrome 

    static boolean isPalindrome(int num){
       int originalNum =num;
       int reversedNum =reverseNum(num);
       if(originalNum == reversedNum){
        System.out.println("It is a palindrome");
        return true;
       }
       else{
        System.out.println("It is not a palindrome");
        return false;
       }
    }

    // prime number 

    static boolean isPrimeOrNot(int num){
        for(int i = 2 ; i*i<=num;i++){
            if(num%i==0){
                return false;
            }
        }

        // for(int i = 2 ; i<=num-1;i++){
        //     if(num%i==0){
        //         return false;
        //     }
        // }
        return true;
    }

    // GCD or HCF

    static int isGCD(int a , int b){
       while (b != 0){
        int oldValueOfb = b;
        b= a%b;
        a= oldValueOfb;
       } 
       int ans = a;
       return ans;
    }
    
    // LCM

    static int getLCM(int a, int b){
        int gcd = isGCD(a, b);
        int prod = a*b;
        int lcm = prod/gcd;
        return lcm;
    }

    public static void main(String[] args){
       // int num = 5645415;
        // printDigit(num);

        // int ans = countDigit(num);
        // System.out.println(ans);

        // int sum = sumOfDigit(num);
        // System.out.println(sum);
        
        // int revNum = reverseNum(num);
        // System.out.println(revNum);

        // boolean ans = isPalindrome(1221);
        // System.out.println(ans);

        // int num = 138;                   
        // System.out.println(isPrimeOrNot(num));

        // int ans = isGCD(3  , 9);
        // System.out.println(ans);

        System.out.println(getLCM(7, 9));
        
    } 
}