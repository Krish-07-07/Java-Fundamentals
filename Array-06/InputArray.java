import java.util.Scanner;
public class InputArray {
    public static void main(String[] args){
        int arr[][] = new int[3][4];
        Scanner sc = new Scanner(System.in);

        for(int i =0;i<= arr.length-1;i++){
           for(int j = 0;j<= arr[i].length-1;j++){
            System.out.println("Provide value for the row=" + i + " and column=2"+ j);
            arr[i][j]=sc.nextInt();
           }
        }

        for(int rowIndex = 0;rowIndex<=arr.length-1;rowIndex++){
            for(int columnIndex =0;columnIndex<=arr[rowIndex].length-1;columnIndex++){
                System.out.print(arr[rowIndex][columnIndex] + " ");
            }
            System.out.println();
        }
    }
}
                               