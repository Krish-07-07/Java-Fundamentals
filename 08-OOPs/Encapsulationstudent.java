public class Student {
    // Attributes
    public  int id;
    public  int age;
    String name;
    public int nos;
    private String gf;

    public String getname(){
        return this.name;
    }

    public int getage(){
        return this.age;
    }

    public void setage(int a){
        //Extra layer of security
        if (age< 100)
        this.age = a;
         return ;
    }

    // Default constructor
    public Student() { 
        System.out.println("Student Default ctor called");
    }

    // Parameterized constructor
    public Student(int id, int age, String name, int nos ,String gf) {
        System.out.println("Parameterized constructor called");
        this.id = id;
        this.age = age;
        this.name = name;
        this.nos = nos;
        this.gf = gf;
    }

    //copy ctor 

    

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
    
    private void gfChatting(){
        System.out.println(name+ "gfChatting");
    }    
        
}
