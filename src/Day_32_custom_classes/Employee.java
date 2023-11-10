package Day_32_custom_classes;

public class Employee {
    String name;
    int id;
    String jobTitle;
    double salary;

    // - create a constructor with two parameter - name & jobTitle

    public Employee (String name, String jobTitle) {
        this.name = name;
        this.jobTitle = jobTitle;
    }

    // - create a constructor with all parameters

    public Employee(String name, int id, String jobTitle, double salary) {
        this.name = name;
        this.id = id;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    @Override
    public String toString() {
        String result = "Info about the employee: " +
                "\n\tName: " + name +
                "\n\tID: " + id +
                "\n\tJob Title: " + jobTitle  +
                "\n\tSalary: " + salary + "$";
        return result;
    }
    public void goToMeeting () {
        System.out.println(name + " is going to meeting.");
    }
}
