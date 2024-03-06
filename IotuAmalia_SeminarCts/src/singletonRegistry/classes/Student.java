package singletonRegistry.classes;

public class Student {
    private int id;
    private String nume;
    private String mail;
    private int an;

    public Student(int id, String nume, String mail, int an) {
        this.id = id;
        this.nume = nume;
        this.mail = mail;
        this.an = an;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", nume='" + nume + '\'' +
                ", mail='" + mail + '\'' +
                ", an=" + an +
                '}';
    }

    public String getNume() {
        return nume;
    }

    public int getId() {
        return id;
    }
}
