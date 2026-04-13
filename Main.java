
class Student {
        int rollNo;
        String name;
        double marks;

        void displayStudent() {
                System.out.println("Student Information");
        }

        void formatName() {
                System.out.println("Name: " + name);
        }
}

class Employee {
        int empId;
        String name;
        int salary;

        Employee(int empId, String name, int salary) {
                this.empId = empId;
                this.name = name;
                this.salary = salary;
        }

        void displayEmployee() {
                System.out.println("Employee Information");
        }
}
class Product {
        int productId;
        String productName;
        double price;

        void setProductId(int productId) {
                this.productId = productId;
        }

        void setProductName(String productName) {
                this.productName = productName;
        }

        void setPrice(double price) {
                this.price = price;
        }

        int getProductId() {
                return productId;
        }

        String getProductName() {
                return productName;
        }

        double getPrice() {
                return price;
        }

        void displayProduct() {
                System.out.println("Product Information");
        }
}

class CollegeStudent extends Student {
        String collegeName;

        void displayCollegeStudent() {
                System.out.println("College Student Information");
                System.out.println("Roll No: " + rollNo);
                System.out.println("Name: " + name);
                System.out.println("Marks: " + marks);
                System.out.println("College Name: " + collegeName);
        }
}

class ProductBilling {
        double calculateBill(double price1) {
                return price1;
        }

        double calculateBill(double price1, double price2) {
                return price1 + price2;
        }

        double calculateBill(double price1, double price2, double price3) {
                return price1 + price2 + price3;
        }
}

public class Main {

        public static void main(String[] args) {

                // -----------------------------
                // Student Object
                // -----------------------------

                Student s1 = new Student();

                s1.rollNo = 24;
                s1.name = "Rashi Sharma";
                s1.marks = 88.5;

                s1.displayStudent();
                s1.formatName();

                // -----------------------------
                // Array of Marks
                // -----------------------------

                System.out.println("\nMarks Array:");

                int marks[] = { 80, 85, 90, 75, 88 };

                for (int i = 0; i < marks.length; i++) {

                        System.out.println("Marks " + (i + 1) +
                                        ": " + marks[i]);
                }

                // -----------------------------
                // Employee Object
                // -----------------------------

                Employee e1 = new Employee(101, "Rahul", 45000);

                e1.displayEmployee();

                // -----------------------------
                // Product Object
                // -----------------------------

                Product p1 = new Product();

                p1.setProductId(1);
                p1.setProductName("Laptop");
                p1.setPrice(50000);

                System.out.println("\nProduct Details:");

                System.out.println("Product ID: " +
                                p1.getProductId());

                System.out.println("Product Name: " +
                                p1.getProductName());

                System.out.println("Price: " +
                                p1.getPrice());

                // -----------------------------
                // Inheritance
                // -----------------------------

                CollegeStudent cs = new CollegeStudent();

                cs.rollNo = 25;
                cs.name = "Ankit";
                cs.marks = 82;
                cs.collegeName = "XYZ College";

                System.out.println("\nCollege Student:");

                cs.displayCollegeStudent();

                // -----------------------------
                // Method Overloading Billing
                // -----------------------------

                ProductBilling pb = new ProductBilling();

                System.out.println("\nBilling:");

                System.out.println("1 Product Bill: " +
                                pb.calculateBill(100));

                System.out.println("2 Product Bill: " +
                                pb.calculateBill(100, 200));

                System.out.println("3 Product Bill: " +
                                pb.calculateBill(100, 200, 300));
        }
}