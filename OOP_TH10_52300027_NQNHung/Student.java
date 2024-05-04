public class Student {
    private String name;
    private String address;
    private char sex; // 'M' for Male, 'F' for Female
    private int score;

    // Constructor
    public Student(String name, String address, char sex, int score) {
        this.name = name;
        this.address = address;
        this.sex = sex;
        this.score = score;
    }

    // Nested class StudentOperator
    public class StudentOperator {
        public void print() {
            System.out.println("Student [\"" + name + "\", \"" + address + "\", \"" + sex + "\", \"" + score + "\"]");
        }

        public String type() {
            if (score > 8) {
                return "A";
            } else if (score >= 5) {
                return "B";
            } else {
                return "C";
            }
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student("John Doe", "1234 Street", 'M', 9);
        Student student2 = new Student("Jane Smith", "5678 Avenue", 'F', 4);
        Student student3 = new Student("Alice Johnson", "91011 Road", 'F', 7);

        StudentOperator operator1 = student1.new StudentOperator();
        StudentOperator operator2 = student2.new StudentOperator();
        StudentOperator operator3 = student3.new StudentOperator();

        operator1.print();
        System.out.println("Rank: " + operator1.type());
        
        operator2.print();
        System.out.println("Rank: " + operator2.type());

        operator3.print();
        System.out.println("Rank: " + operator3.type());
    }
}
