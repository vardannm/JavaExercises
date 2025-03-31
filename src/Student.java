public class Student {
    private String name;
    private int rollNumber;
    private double marks;

    public Student(String name , int rollNumber , double marks){
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public String calculateGrade(){
        if(marks >= 90){
            return "A";
        } else if (marks>=80) {
            return "B";
        } else if (marks>=70) {
            return "C";
        } else if (marks>=60) {
            return "D";
        } else{
            return "F";
        }
    }
    public void displayDetails(){
        System.out.println("Student Details:");
        System.out.println("Name "+ name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks" + marks);
        System.out.println("Grade: " + calculateGrade());
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }
    public static void main(String[] args) {
        // Create a Student object
        Student student1 = new Student("Alice", 101, 85.5);

        // Display student details
        student1.displayDetails();

        // Test grade calculation
        System.out.println("Grade: " + student1.calculateGrade());
    }
}
