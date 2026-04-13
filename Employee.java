class Employee {

    int empId;
    String empName;
    double salary;

    // Static company name
    static String companyName = "Vidyut pvt ltd";

    // Constructor
    Employee(int empId, String empName, double salary) {

        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    void displayEmployee() {

        System.out.println("\nEmployee Details:");
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Salary: " + salary);
        System.out.println("Company Name: " + companyName);
    }
}