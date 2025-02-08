package chapter8;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

class Student implements Comparable<Student> {
    private String name;
    private String address;
    private double gpa;

    public Student(String name, String address, double gpa) {
        this.name = name;
        this.address = address;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Address: " + address + ", GPA: " + gpa;
    }

    @Override
    public int compareTo(Student other) {
        return this.name.compareTo(other.name);
    }
}

public class StudentData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Student> studentList = new LinkedList<>();

        while (true) {
            System.out.println("Welcome to student data entry. Enter 'done' or 'exit' for name to exit.");
            System.out.println("Enter student data:");
            System.out.print("Name: ");
            String name = scanner.nextLine();

            if (name.equalsIgnoreCase("done") || name.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.print("Address: ");
            String address = scanner.nextLine();

            double gpa = -1; 
            while (gpa < 0 || gpa > 4) { 
                try {
                    System.out.print("GPA (0.0 - 4.0): ");
                    gpa = Double.parseDouble(scanner.nextLine());
                    if(gpa < 0 || gpa > 4) {
                        System.out.println("Invalid GPA. Please enter a value between 0.0 and 4.0.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a numeric GPA.");
                }
            }


            Student student = new Student(name, address, gpa);
            studentList.add(student);
        }


        Collections.sort(studentList);

        try (FileWriter writer = new FileWriter("student.txt")) {
            for (Student student : studentList) {
                writer.write(student.toString() + "\n");
            }
            System.out.println("Student data written to student.txt");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }

        scanner.close();
    }
}