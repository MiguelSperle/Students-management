public class Student {
    private String name;
    private int age;
    private String course;
    public Student(String name, int age, String course){
        this.name = name;
        this.age = age;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Estudante " + "name='" + this.name + '\'' + ", age=" + this.age + ", course='" + this.course + '\'';
    }
}
