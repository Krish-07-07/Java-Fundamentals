public class TwodimArray {
    public static void main(String[] args){
        //declaration
        int [][]arr;
        //allocation
        arr = new int[3][4];
        //init
        int[][] brr ={
            {1,2},
            {2,3,5,4,1},
            {3,8,2},
            {9}
        };

        // int rowLength = brr.length;
        // //int columnLength = brr[0].length;

        // for(int rowIndex = 0 ; rowIndex<=rowLength-1 ;rowIndex++){
        //     int columnLength =brr[rowIndex].length;
        //     for(int columnIndex = 0 ; columnIndex<= columnLength-1 ; columnIndex++){
        //         System.out.print(brr[rowIndex][columnIndex]+" ");
        //     }
        //     System.out.println();
        // }
         
        
        // Traversal in 2 d array 
        for(int rowIndex = 0; rowIndex<=brr.length-1;rowIndex++){
            for(int columnIndex = 0;columnIndex<=brr[rowIndex].length-1;columnIndex++){
                System.out.print(brr[rowIndex][columnIndex]+ " ");
            }
            System.out.println();
        }
    
}
}