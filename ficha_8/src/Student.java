public class Student implements Comparable<Student> {
    private int number;
    private String name;

    public Student() {
        number = 0;
        name = "";
    }

    public Student(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Student student = (Student) obj;
        return number == student.number && name.equals(student.name);
    }

    @Override
    public int compareTo(Student student) {
        return Integer.compare(number, student.number);
    }

    @Override
    public int hashCode() {
        return 31 * number + name.hashCode();
    }
}
