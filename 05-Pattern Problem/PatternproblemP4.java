Public class Patternproblem {
   static void main(strings[] args){

    //butterfly pattern 
    int n = 4 ;

    for(int row = 1 ; row <= n ; row++){

        for(int col =1 ; col<=row ; col++){
            System.out.print("* ");
        }
        
        for(int col=1 ; col <= 2*(n-row);col++ ){
            System.out.print("  ");
        }

        for(int col=1 ; col<= row;col++){
            System.out.print("* ");
        }
        System.out.println();
    }

    for(int row =1 ; row<=n ; row++){

        for(int col =1 ; col<= n-row +1;col++){
            System.out.print("* ");
        }
        
        for(int col =1 ; col<= 2*row -2; col++){
            System.out.print("  ");
        }

        for(int col =1 ; col<= n- row +1 ; col++){
            System.out.print("* ");
        }
        System.out.println();
    }
      
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
  }
}
