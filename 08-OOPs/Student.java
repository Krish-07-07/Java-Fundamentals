public class Student {
    // Attributes
    private int id;
    private int age;
    String name;
    private int nos;

    // Default constructor
    public Student() { 
        System.out.println("Student Default ctor called");
    }

    // Parameterized constructor
    public Student(int id, int age, String name, int nos) {
        System.out.println("Parameterized constructor called");
        this.id = id;
        this.age = age;
        this.name = name;
        this.nos = nos;
    }

    // Method / Behaviour
    public void study() {
        System.out.println(name + " is studying");
    }

        public void bunk(){
            System.out.println(name +" bunking");
        }

        public void sleep(){
            System.out.println(name +" sleeping");
        }
}

    
