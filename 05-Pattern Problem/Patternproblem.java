
public class Patternproblem {

    static void main (String[] args){
      // Square pattern 

      //   int n = 4 ;
      //   for (int row =1 ; row<= n;row++){
      //       for (int col =1 ;col<=n;col++){
      //           System.out.print("*  ");
      //       }
      //       System.out.println();

      //   }
      
      // Rectangle pattern

        int n = 3 ;
         for (int row = 1 ; row <=n ; row ++){
             for (int col =1 ; col<=5 ; col++){
                System.out.print("* ");
             }
             System.out.println();
         }
        
        //Right angle triangle pattern 

        // int n= 5 ;
        // for(int row = 1; row<=n ; row++){
        //     for(int col =1 ; col<=row ; col++){
        //         System.out.print("* ");
        //         }
        //         System.out.println();
        //     }

        //Rohmbus pattern 

        // int n = 5;
        // for(int row = 1; row<=n ; row++){

        //     for(int col=1 ; col<=n-row ; col++){
        //         System.out.print("  ");
        //     }

        //     for(int col=1 ; col<=5;col++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        
        // }

       //inverted right angle traingle

    //    int n= 5;
    //    for(int row =1  ; row<= n ;row++){
    //        for(int col =1  ; col<= n-row+1;col++){
    //         System.out.print("* ");
    //        }
    //        System.out.println();
    //    }
        
       // solid pyramid 
      
    //    int n = 5;
    //    for (int row =1 ;row <= n ; row++){
    //     for (int col =1 ; col<=n-row;col++){
    //         System.out.print("  ");
    //     }
    //     for (int col =1;col<=2*row -1 ;col++){
    //         System.out.print("* ");
    //     }   
    //     System.out.println(); 
    //     }

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

    //hollow pyramid 

    // int n = 5 ;

    // for (int row =1 ; row <= n; row ++){
         
    //     for(int col =1 ; col<= n - row ;col++){
    //     System.out.print("  ");
    //     }

    //     if (row ==1 || row ==n){
    //         for (int col =1  ; col<= 2*row -1 ; col++){
    //             System.out.print("* ");
    //         }
    //        }
    //        else {

    //         System.out.print("* ");

    //         for(int col =1 ; col<= 2*row - 3 ; col++){
    //             System.out.print("  ");
    //         } 

    //         System.out.print("* ");

    //        }

    //        System.out.println();
    // }


    //Solid diamond pattern

    // int n = 4;
    
    // for(int row = 1 ; row <= n ; row ++){

    //    for(int col= 1 ; col<= n-row; col++){
    //     System.out.print("  ");
    //    } 

    //    for (int col = 1 ; col <= 2*row -1 ; col++){
    //     System.out.print("* ");
    //    }
    //    System.out.println();
    // }


    //  for (int row =1 ; row<= n ; row ++){

    //     if(row==1){
    //         continue;
    //     }

    //     for (int col =1 ; col<=row -1 ; col++){
    //         System.out.print("  ");
    //     }

    //     for (int col =1 ; col <= 2*n-2*row+1 ; col++){
    //         System.out.print("* ");
    //     }
    //     System.out.println();
    //  }

     //hollow diamond pattern 

    //  int n = 4 ;

    // for (int row =1 ; row <= n; row ++){
         
    //     for(int col =1 ; col<= n - row ;col++){
    //     System.out.print("  ");
    //     }

    //     if (row ==1 ){
    //         for (int col =1  ; col<= 2*row -1 ; col++){
    //             System.out.print("* ");
    //         }
    //        }
    //        else {

    //         System.out.print("* ");

    //         for(int col =1 ; col<= 2*row - 3 ; col++){
    //             System.out.print("  ");
    //         } 

    //         System.out.print("* ");

    //        }

    //        System.out.println();
    // }

    //   for (int row =1 ; row <= (n-1) ;row++){
    //       for (int col = 1 ; col <= row ;col++){
    //         System.out.print("  ");
    //       }

    //       if (row==(n-1)){
    //         System.out.print("* ");
    //       }

    //       else {
    //         System.out.print("* ");

    //         for(int col =1 ; col<= 2*(n-row)-3;col++){
    //             System.out.print("  ");
    //         }
    //         System.out.print("* ");
    //       }
    //       System.out.println();  

    //   }


    //butterfly pattern 

    // int n = 4 ;

    // for(int row = 1 ; row <= n ; row++){

    //     for(int col =1 ; col<=row ; col++){
    //         System.out.print("* ");
    //     }
        
    //     for(int col=1 ; col <= 2*(n-row);col++ ){
    //         System.out.print("  ");
    //     }

    //     for(int col=1 ; col<= row;col++){
    //         System.out.print("* ");
    //     }
    //     System.out.println();
    // }

    // for(int row =1 ; row<=n ; row++){

    //     for(int col =1 ; col<= n-row +1;col++){
    //         System.out.print("* ");
    //     }
        
    //     for(int col =1 ; col<= 2*row -2; col++){
    //         System.out.print("  ");
    //     }

    //     for(int col =1 ; col<= n- row +1 ; col++){
    //         System.out.print("* ");
    //     }
    //     System.out.println();
    // }
      
    //numerical pattern 

    // int n = 5;
    // for (int row = 1; row<=n ; row++){

    //     for(int col =1 ; col<=row ; col++){
    //         System.out.print(col+ " " );
    //     }
    //     System.out.println();
    // }

    // int n = 5;
    // int count =1 ;

    // for(int row =1 ; row<=n ; row++){

    //     for (int col = 1 ; col <= row ; col++){
    //         System.out.print(count+ " ");
    //         count++;
    //     }
    //     System.out.println();
    // }

    // letter pattern 

   //  int n = 5;
   //   for(int row =1 ; row<= n; row++){
      
   //    for(int col=1 ;col<=row;col++){
   //       int a = col;
   //       int b = ('A' - 1);
   //       int ans = a+b;
   //       char finalAns = (char)ans;
   //       System.out.print(finalAns + " ");
   //    }
   //    System.out.println();
   //   }
    

   //   int n = 5;
   //    for(int row =1 ; row <= n; row++){
   //       for(int col=1 ; col<= row; col++){
   //          int a = n- col;
   //          int b = 'A';
   //          int ans = a+b;
   //          char finalAns = (char)ans;
   //          System.out.print(finalAns + " ");
   //       }
   //       System.out.println();
   //    }

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

   // int n = 4;
   
   // for(int row =1 ; row <= n; row ++){

   //    for(int col =1 ; col <=n-row; col++){
   //       System.out.print("  ");
   //    }

   //    for(int col =1 ; col<=row ; col++){
   //       System.out.print(col + " ");
         
   //    }
      
   //    int rowValue = row; 
   //    int decRowValue = row -1 ;
   //    for(int col =1 ; col<=row-1 ;col++){
   //    System.out.print(decRowValue+ " ");
   //    decRowValue--;
   //    }
      
   //    System.out.println();

   // }


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
    

