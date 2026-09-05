public class Patternproblem {

  static void main (String[] args){

   // solid pyramid 
      
       int n = 5;
       for (int row =1 ;row <= n ; row++){
        for (int col =1 ; col<=n-row;col++){
            System.out.print("  ");
        }
        for (int col =1;col<=2*row -1 ;col++){
            System.out.print("* ");
        }   
        System.out.println(); 
        }

       // inverted solid pyramid 

    //    int n = 4 ; 
    //    for (int row =1  ; row<= n  ; row++){
    //     for(int col =1 ; col<= row -1 ; col++ ){
    //         System.out.print("  ");
    //     }
    //     for(int col =1 ; col<= 2*n-2*row +1;col++){
    //         System.out.print("* ");
    //     }
    //     System.out.println();
    //    }
       

      //hollow rectangle pattern 
         
    //   int n = 4 ;
    //   for (int row =1 ; row <= n ; row++){

    //     for (int col =1 ; col <= 6 ; col++){

    //         if(row == 1 || row == n){
    //             System.out.print("* ");
    //         }
    //         else {
    //             if(col==1 || col==6){
    //                 System.out.print("* ");
    //             }
    //             else{
    //                 System.out.print("  ");
    //             }
    //         }
    //     }
    //     System.out.println();
    //   }


    // Hollow right angle traingle 

    // int n = 5 ;
    // for (int row = 1 ; row<=n ; row ++){

    //     if(row == 1 || row == 2 || row == n){
    //         for(int col =1 ; col<= row ; col++){
    //         System.out.print("* ");
    //         }
    //     }
    //     else {
    //         //middle row 
    //         System.out.print("* ");

    //         for(int col =1 ; col<= (row-2) ;col++ ){
    //             System.out.print("  ");
    //         }
    //         System.out.print("* ");
    //     }
    //     System.out.println();
    // }
  }
}
