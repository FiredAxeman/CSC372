package chapter6;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(1, "Alice", "100 Main St"));
        students.add(new Student(5, "Bob", "200 1st St"));
        students.add(new Student(3, "Charlie", "300 2nd St"));
        students.add(new Student(2, "David", "400 3rd St"));
        students.add(new Student(4, "Eve", "500 4th St"));
        students.add(new Student(10, "Frank", "500 5th St"));
        students.add(new Student(7, "Grace", "600 6th St"));
        students.add(new Student(9, "Henry", "700 7th St"));
        students.add(new Student(6, "Ivy", "800 8th St"));
        students.add(new Student(8, "Jack", "900 9th St"));

        SelectionSort.sort(students, new Student.NameComparator());
        System.out.println("Students sorted by name:");
        for (Student student : students) {
            System.out.println(student);
        }

        SelectionSort.sort(students, new Student.RollnoComparator());
        System.out.println("\nStudents sorted by rollno:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
