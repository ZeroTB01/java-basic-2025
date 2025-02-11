package stdent;

public class Student {
    private String name;
    private int age;
    private double grade;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGrade() {
        return grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if((age >= 15) && (age <= 30)){
            this.age=age;
        }else {
            System.out.println("抱歉,你的年龄不符合(18-30)");
        }
    }

    public void setGrade(double grade) {
        if(grade >=0 && grade <=100){
            this.grade = grade;
        }else {
            System.out.println("成绩非正常区间(0-100)");
        }
    }

    public Student(String name, int age, double grade) {
        this.setName(name);
        this.setAge(age);
        this.setGrade(grade);
    }

    public void displayInfo(){
        System.out.println("Name:" + name + ",Age:" + age + ",Grade:" + grade);
    }
}

