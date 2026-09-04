import java.util.Scanner;

public class While {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number until you want to count:");
        int n = sc.nextInt();

        int i = 2;

        while (i <= n) {
            if (i%2 == 0){
            System.out.println(i);
            }
            i++;
        }
    }
}