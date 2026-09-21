public class MultiplyArray {
    public static void main(String[] args){
        // int arr[] ={12,13,50};
        // int n = arr.length;
        // int ans = 1;

        // for(int i = 0 ; i<=n-1 ; i++){
        //   int value = arr[i];
        //   ans = ans*value;
        // }
        // System.out.println(ans);

        int arr[][] = {{1,2,3},{4,5,6}};
        int ans =1 ;

        for(int i = 0 ; i<=arr.length-1;i++){
            for(int j = 0; j<=arr[i].length-1;j++){
                int value = arr[i][j];
                ans = ans*value;
            }
        }
         System.out.println(ans);
    }
    
}
