package singletonRegistry.main;

import singletonRegistry.classes.Student;
import singletonRegistry.classes.SustinereExamen;

public class Main {
    public static void main(String[] args) {
        Student student1=new Student(123,"Iotu Amalia","iotuamalia20@stud.ase.ro",3);
        Student student2=new Student(234,"Pavel Alex","pavelalex20@stud.ase.ro",2);
        Student student3=new Student(587,"Mircea Ioana","mirceaioana21@stud.ase.ro",3);
        Student student4=new Student(808,"Istrate Ana","istrateana21@stud.ase.ro",1);
        SustinereExamen examPoo=new SustinereExamen("Poo");
        SustinereExamen examCts=new SustinereExamen("Cts");
        examPoo.inregistrareStudent(student1);
        examPoo.inregistrareStudent(student2);
        examPoo.inregistrareStudent(student1);
        examPoo.inregistrareStudent(student3);
        examPoo.inregistrareStudent(student4);
        examPoo.inregistrareStudent(student2);
    }
}
