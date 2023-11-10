package Day_32_custom_classes;

import java.util.Scanner;

public class Company {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Employee name: ");
        String name = s.next();
        System.out.print("Employee ID: ");
        int id = s.nextInt();
        System.out.print("Employee Job Title: ");
        String jobTitle = s.next();
        System.out.print("Salary: ");
        double salary = s.nextDouble();
        System.out.println();
        Employee employeeOne = new Employee(name, id, jobTitle, salary);
        System.out.println(employeeOne);
        employeeOne.goToMeeting();

        System.out.println();
        Employee employeeTwo = new Employee(name, id, jobTitle, salary);
        System.out.println(employeeTwo);
        employeeTwo.goToMeeting();
    }
}
