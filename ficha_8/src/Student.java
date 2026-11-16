public class Student {
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
}
