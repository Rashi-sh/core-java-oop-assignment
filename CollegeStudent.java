class Student {
    // display student
    void displayStudent() {
        System.out.println("Student Information");
    }
}

class CollegeStudent extends Student {

    String collegeName;

    void displayCollegeStudent() {

        displayStudent();

        System.out.println("College Name: " + collegeName);
    }
}