package stdent;

public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student("liLei",18,100);
        student.setAge(12);
        student.setGrade(101);

        student.displayInfo();
    }
}
