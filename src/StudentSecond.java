import java.util.ArrayList;
import java.util.List;
public class StudentSecond {
    private int studentId;
    private String name;
    private List<Integer> grades;

    public StudentSecond(int studentId,String name){
        this.studentId = studentId;
        this.name = name;
        this.grades = new ArrayList<>();
    }
    public void addGrade(int grade){
        if(grade >= 0 && grade <=100){
            grades.add(grade);
        }else{
            System.out.println("Invalid grade! Please enter a grade between 0 and 100.");
        }
    }
    public double calculateAverage(){
        if(grades.isEmpty()){
            return 0.0;
        }
        int sum = 0;
        for(int grade : grades) {
            sum+=grade;
        }
        return (double) sum / grades.size();
    }
    public void displayInfo(){
        System.out.println("Student ID: " + studentId);
        System.out.println("name: " + name);
        System.out.println("Grades: " + grades);
        System.out.println("Average Grade: " + calculateAverage());
    }
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getGrades() {
        return grades;
    }
}
