// By Omar Badwy
/*Exercise 2 : You are required to create a Student class with the following structure and interact with it in the main method:
Define fields: name, age, and gpa.
Create a constructor to initialize these fields.
Add two methods: displayInfo() and study().
Use getters and setters to access and modify data safely.
In the main method, create multiple Student objects and use their methods.*/

public class ArrayTasks {
    public static void main(String[] args) {
        int[] scores = {85, 92, 78, 96, 88};

        // 1. Find max
        int max = scores[0];
        for (int s : scores) {
            if (s > max) max = s;
        }
        System.out.println("Maximum score: " + max);

        // 2. Sum + Average
        int sum = 0;
        for (int s : scores) sum += s;
        double avg = (double) sum / scores.length;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);

        // 3. Search for specific value
        int searchValue = 92;
        int index = -1;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == searchValue) {
                index = i;
                break;
            }
        }

        if (index != -1)
            System.out.println("Value " + searchValue + " found at index: " + index);
        else
            System.out.println("Value " + searchValue + " not found.");
    }
}
