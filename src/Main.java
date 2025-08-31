// By Omar Badwy
/*Exercise 1 Write a Java program to perform the following tasks on an integer array of test scores:
int[] scores = {85, 92, 78, 96, 88}; Find the maximum score.
Calculate and print the sum and average of all scores.
Search for a specific value (e.g., 92) and display its index.
Display a message if the value is not found.*/

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
