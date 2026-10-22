package classes.and.objects;

public class student {
    public int id;
    public String name;
    public String email;
    public String dob;
    public String grade;

    public student() {
    }

    public student(int id, String name, String email, String dob, String grade) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", dob='" + dob + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
}
