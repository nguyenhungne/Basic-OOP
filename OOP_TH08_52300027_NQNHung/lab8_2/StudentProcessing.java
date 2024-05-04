import java.util.ArrayList;
import java.util.List;

abstract class Student {
    protected String sName;
    protected double gpa;

    public Student(String sName, double gpa) {
        this.sName = sName;
        this.gpa = gpa;
    }

    public abstract String getRank();
}

class ITStudent extends Student {
    private int sID;

    public ITStudent(String sName, double gpa, int sID) {
        super(sName, gpa);
        this.sID = sID;
    }

    @Override
    public String getRank() {
        if (gpa <= 5) return "C";
        else if (gpa <= 8) return "B";
        else return "A";
    }
}

class MathStudent extends Student {
    private String sID;

    public MathStudent(String sName, double gpa, String sID) {
        super(sName, gpa);
        this.sID = sID;
    }

    @Override
    public String getRank() {
        if (gpa >= 5) return "Passed";
        else return "Failed";
    }
}

public class StudentProcessing {

    public static ArrayList<Student> findStudent(ArrayList<Student> lstStu) {
        ArrayList<Student> resultList = new ArrayList<>();
        for (Student student : lstStu) {
            String rank = student.getRank();
            if ("A".equals(rank) || "Passed".equals(rank)) {
                resultList.add(student);
            }
        }
        return resultList;
    }

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new ITStudent("John Doe", 9.0, 123));
        students.add(new MathStudent("Jane Smith", 4.5, "M123"));

        ArrayList<Student> result = findStudent(students);
        for (Student student : result) {
            System.out.println(student.sName + " " + student.getRank());
        }
    }
}
