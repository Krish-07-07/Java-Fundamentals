public class SumofArray{
    public static void main(String[] args){
        // int arr[] = {10,20,30};
        // int sum = 0;
        // int n = arr.length;

        // for(int i =0; i<=n-1 ;i++){
        //     int value = arr[i];
        //     sum = sum+value;

        // }

        // System.out.println(sum);

        int arr[][] ={{1,4,3},{4,2,1}};
        int sum = 0;
        
        for(int i = 0;i<=arr.length-1;i++){
            for(int j= 0;j<=arr[i].length-1;j++){
                int value = arr[i][j];
                sum = sum+value;
            }
        }
        System.out.println(sum);

    }
}

