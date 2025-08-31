class Student {
    private String name;
    private int age;
    private double gpa;

    // Constructor
    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    // Getters & Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public double getGpa() { return gpa; }
    public void setGpa(double gpa) { this.gpa = gpa; }

    // Methods
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", GPA: " + gpa);
    }

    public void study() {
        System.out.println(name + " is studying...");
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Omar", 21, 3.8);
        Student s2 = new Student("Ali", 22, 3.5);

        s1.displayInfo();
        s1.study();

        s2.displayInfo();
        s2.study();
    }
}
