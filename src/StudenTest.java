public class StudenTest {
    public static void main(String[] args) {
        StudentSecond student = new StudentSecond(101 , "Vardan");

        student.addGrade(85);
        student.addGrade(82);
        student.addGrade(78);
        student.addGrade(69);

        student.displayInfo();
    }
}
