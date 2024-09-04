package deepuu;
import java.util.Scanner;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of persons: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Person[] persons = new Person[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name for person " + (i + 1) + ": ");
            String name = scanner.nextLine();
            System.out.print("Enter age for person " + (i + 1) + ": ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            persons[i] = new Person(name, age);
        }

        System.out.println("\nPersons entered:");
        for (Person person : persons) {
            person.display();
        }

        scanner.close();
    }
}
