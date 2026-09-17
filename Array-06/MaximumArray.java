public class MaximumArray {
    public static void main(String[] args){
        // int arr[] = {10,56,-45,12,13};
        // int n = arr.length;
        // int maxValue = arr[0];

        // for(int i = 0 ;i<=n-1;i++){
        //     if(arr[i]>maxValue){
        //         maxValue = arr[i];
        //     }
        // }
        // System.out.println(maxValue);

        int arr[][] ={{4578,2112,244},{4124,-5,6}};
        int maxValue = arr[0][0];

        for(int i = 0;i<=arr.length-1;i++){
            for(int j =0;j<=arr[i].length-1;j++){
                if(arr[0][0]>maxValue){
                    maxValue = arr[i][j];
                }

            }
        }
        System.out.println(maxValue);
    }
    
}
