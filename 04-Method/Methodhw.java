public class Methodhw {

// Question 1     
    static void Printwelcome(){
        System.out.println("OPTIMUS PRIME : GREETINGS!!!!!" );
    }

// Question 2
   static int Add(int a , int b ){
    return a + b;
   }
 
   //Question 3
   static boolean Iseven (int number){
    return number % 2 == 0;
   } 

   //Question 4 
   static int Getmax (int a , int b){
//     if (a>b){
//         return a;
//     }
//     return b;
//    }
      
      return (a > b) ? a : b ;
   }

   //Question 5 

    static void Calculatepercentage (int obtained , int total){
        if (total == 0){
            System.out.println("Percentage cant be obtained");
            return ;
        }
        float Percentage = ((float)obtained/total)*100;
        System.out.println("Percentage :" + Percentage);
    }






    static void main (String[] args){

        // Printwelcome();

        // int result =  Add(12, 12);
        // System.out.println(result);

        // boolean result = Iseven(4);
        // System.out.println(result);
        
        // int result = Getmax(5, 10);
        // System.out.println(result);

        Calculatepercentage(409, 500);
        System.out.println();
    }
    
}
