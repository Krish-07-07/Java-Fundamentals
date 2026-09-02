import java.util.Scanner;

public class Percentage {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of subject1 :");
        int s1=sc.nextInt();
        System.out.println("Enter the marks of subject2 :");
        int s2=sc.nextInt();
        System.out.println("Enter the marks of subject3 :");
        int s3=sc.nextInt();
        System.out.println("Enter the marks of subject4 :");
        int s4= sc.nextInt();
        System.out.println("Enter the marks of subject5 :");
        int s5=sc.nextInt();

        int min = Math.min(s1, Math.min(s2, Math.min(s3, Math.min(s4, s5))));
        int total = s1 + s2 + s3 + s4 + s5;
        int top4total = total-min;
        float percentage = (top4total/400f)*100;

        System.out.println("The mininum number in the subject is :" + min);
        System.out.println("The total marks obtained is :" + top4total);
        System.out.println("The percentage of top 4 subjects :" + percentage);
    }
    
}
