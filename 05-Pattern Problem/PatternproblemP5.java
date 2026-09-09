public class PatternproblemP5 {
    static void main(String[] args){
        //  int n = 4 ;
   //  for(int row =1 ; row <= n-1  ; row++){

   //    for(int col=1; col<=row-1 ;col++){
   //       System.out.print("  ");
   //    }
   //  for(int col =1 ; col<=(2*(n-row))+ 1 ; col++){
   //    System.out.print("* ");
   //  }
   //  System.out.println();
   //  }

   //  for(int row =1 ; row <= n; row++){
      
   //    for(int col =1 ; col<=n-row; col++){
   //       System.out.print("  ");
   //    }
   //     for(int col = 1 ; col<=2*row -1 ; col++){
   //       System.out.print("* ");
   //    }
   //    System.out.println();

   //  }


   // numeric pattern 

   int n = 4;
   
   for(int row =1 ; row <= n; row ++){

      for(int col =1 ; col <=n-row; col++){
         System.out.print("  ");
      }

      for(int col =1 ; col<=row ; col++){
         System.out.print(col + " ");
         
      }
      
      int rowValue = row; 
      int decRowValue = row -1 ;
      for(int col =1 ; col<=row-1 ;col++){
      System.out.print(decRowValue+ " ");
      decRowValue--;
      }
      
      System.out.println();

   }


   // int n = 4;

   // for(int row =1 ; row <= n ; row++){

   //    for(int col =1 ; col <= n-row; col++ ){
   //    System.out.print("  ");
   //    }
   //    for(int col =1 ; col <= 2*row -1 ;col++){
   //       System.out.print(row + " ");
   //    }
   //    System.out.println();
   // }


   // Alpha pattern 

   // int n = 4 ;

   // for (int row =1 ; row <= n ;row++){

   //    for(int col =1 ; col<=n-row ; col++){
   //       System.out.print("  ");
   //    }

   //    for(int col =1 ; col<=row ; col++){
   //       int a = col;
   //       int b = 'A'-1;
   //       int ans = a+b;
   //       char finalAns = (char)ans;
   //       System.out.print(finalAns + " ");
   //    }

   //    char toPrint = (char)(row + 'A' - 2 );
   //    for(int col = 1 ; col <= row-1 ; col++){
   //       System.out.print(toPrint + " ");
   //       toPrint--;
   //    }
   //    System.out.println();

   // }

        }
        
    }
    
