public class Method {
    static void tableOf2(){
        for (int i = 1 ; i<=10 ;i++){
            int ans = 2*i;
            System.out.println("-->" + ans);
        }
    } 
    static void printSum(int x , int y){
        System.out.println("SUM:" + (x+y));
    }

    static int add(int p , int q){
        int sum = p+q;
        return sum;
    }

    static int add(int p, int q , int r){
        int sum = p+q+r;
        return sum;
    }

    static void solve(int num){
        System.out.println("Inside solve : " + num);
        num = num*10;
        System.out.println("Inside solve :" + num);
    }

        
    static void main (String[] args){
        int num = 5;
        System.out.println("inside main :" + num);
        solve(num);
        System.out.println("Inside main :" + num);
        

        //   int ans1 = add(12, 45);
        //   int ans2 = add(42, 12, 12);
        //   System.out.println("RESULT : " + ans1);
        //   System.out.println("RESULT :"+ ans2);


    //    int result = add(04, 03);
    //    System.out.println("RESULT: " + result);  
    

        // printSum(69, 65); 
        // System.out.println("hi");
        // tableOf2();
        // System.out.println("bye");
    }
}
