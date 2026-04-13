class Student {

    int rollNo;
    String name;
    double marks;

    // Method to display details
    void displayStudent() {

        System.out.println("Student Roll No: " + rollNo);
        System.out.println("Student Name: " + name);
        System.out.println("Student Marks: " + marks);
    }

    // Method for String formatting
    void formatName() {

        System.out.println("\nName Formatting:");
        System.out.println("Original Name: " + name);
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Lowercase: " + name.toLowerCase());
        System.out.println("Length: " + name.length());
    }
}