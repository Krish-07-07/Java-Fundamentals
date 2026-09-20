public class Minimumvalue {
    public static void main (String [] args){
        // int arr[]= {15,36,75,41,12};
        // int n = arr.length;
        // int minimumValue = arr[0];

        // for(int i = 0 ; i<=n-1 ;i++){
        //     if(arr[i]<minimumValue){
        //         minimumValue = arr[i];
        //     }
        // }
        // System.out.println(minimumValue);

        int arr[][]={{123,456,450},{452,421,423}};
        int minimumValue =arr[0][0];

        for(int i = 0;i<=arr.length-1;i++){
            for(int j =0 ;j<=arr[i].length-1;j++){
                if(arr[0][0]<minimumValue){
                    minimumValue=arr[i][j];
                }
            }
        }
        System.out.println(minimumValue);






    }
    
}
