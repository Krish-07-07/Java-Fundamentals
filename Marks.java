import java.util.Scanner;
public class Marks {
     public static void main(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the marks of subject 1 :");
        int subject1 = sc.nextInt();
        System.out.println("Enter the marks of subject 2 :");
        int subject2 = sc.nextInt();
        System.out.println("Enter the marks of subject 3 :");
        int subject3 = sc.nextInt();
        System.out.println("Enter the marks of subject 4 :");
        int subject4 = sc.nextInt();
        System.out.println("Enter the marks of subject 5 :");
        int subject5 = sc.nextInt();

        int total = subject1 + subject2 + subject3 + subject4 + subject5;
        float marks = (total/500f)*100;
        
        if (marks>90){
            System.out.println("The grade is : 'A'");
        }
        else if(marks>80){
            System.out.println("The grade is : 'B'");
        }
        else if(marks>70){
            System.out.println("The grade is : 'C'");
        }
        else if(marks>60){
            System.out.println("The grade is : 'D'");
        }
        else {
            System.out.println("study harder nigga your principal will slap the hell out of you");
        }
        System.out.println("The total marks out of 500 is "+ total);
        System.out.println("The percentage is :" + marks);
     }
}
