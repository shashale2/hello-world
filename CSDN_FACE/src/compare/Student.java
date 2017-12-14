package compare;

public class Student implements Comparable<Student> {
    private String name;        // ����
    private int age;            // ����

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }

    public int compareTo(Student o) {
        return this.age - o.age; // �Ƚ�����(���������)
    }

}