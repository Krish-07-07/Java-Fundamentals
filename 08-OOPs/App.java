public class App {

    public static void main(String[] args) throws Exception {

        // default ctor

        // Student A = new Student();
        // A.id = 1;
        // A.age = 14;
        // A.name = "Ram";
        // A.nos = 5;

        // System.out.println(A.name);
        // System.out.println(A.age);
        // System.out.println(A.id);
        // System.out.println(A.nos);

        // A.bunk();
        // A.study();
        // A.sleep();


        // Parameterised Ctor

        Student A = new Student(1, 12, "Ram", 5);

        System.out.println(A.name);
        System.out.println(A.age);
        System.out.println(A.id);
        System.out.println(A.nos);

        A.bunk();
        A.study();
        A.sleep();
    }
}
