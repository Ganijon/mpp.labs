package lesson9.lecture.practice;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

class Student {

    public static enum Gender {
        Male, Female
    };

    private String name;
    private int regNo;
    private float gpa;
    private Gender gender;

    public static void main(String[] args) {

        Consumer<Object> printer = System.out::println;

        List<Student> students = Arrays.asList(
                new Student(4, "Elen", Gender.Female, 3.2F),
                new Student(3, "Chris", Gender.Male, 3.75F),
                new Student(4, "Frank", Gender.Male, 4L),
                new Student(4, "George", Gender.Male, 3.5F),
                new Student(1, "Alice", Gender.Female, 4),
                new Student(2, "Bob", Gender.Male, 3),
                new Student(4, "Diane", Gender.Female, 3.6F)
        );

        long count = students.stream().count();
        printer.accept("Student Count: " + count);

        long countFemales = students.stream().filter(Student::isFemale).count();
        printer.accept("Female Student Count: " + countFemales);

        Student topStudent = students
                .stream()
                .max((s1, s2) -> Float.compare(s1.getGpa(), s2.getGpa())).get();
        printer.accept("Top Student: " + topStudent);

        float avgGpa = students
                .stream()
                .map(Student::getGpa)
                .reduce(0F, Float::sum) / count;
        printer.accept(String.format("Average GPA %,.2f: ", avgGpa));

        List<Student> sorted = students
                .stream()
                .sorted((s1, s2) -> Float.compare(s1.gpa, s2.gpa))
                .collect(Collectors.toList());
        printer.accept("Student names: " + sorted);

        
    }

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }
    
    public Student(int regNo, String name) {
        this.regNo = regNo;
        this.name = name;
    }

    public Student(int regNo, String name, Gender gender) {
        this.regNo = regNo;
        this.name = name;
        this.gender = gender;
    }

    public Student(int regNo, String name, Gender gender, float GPA) {
        this.regNo = regNo;
        this.name = name;
        this.gender = gender;
        this.gpa = GPA;

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        sb.append(" #");
        sb.append(regNo);
        sb.append(" Name:");
        sb.append(name);
        sb.append(" Gender:");
        sb.append(gender);
        sb.append(" GPA:");
        sb.append(gpa);
        sb.append("}");
        return sb.toString();
    }

    public boolean isFemale() {
        return gender == Gender.Female;
    }

    public boolean isMale() {
        return gender == Gender.Male;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRegNo() {
        return regNo;
    }

    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

}
