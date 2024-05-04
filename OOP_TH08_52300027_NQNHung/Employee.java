class Employee extends Person {
    private String id;
    private double salary;

    // Constructor
    public Employee(String name, int birthYear, String id, double salary) {
        super(name, birthYear); // Gọi constructor của lớp cơ sở (Person)
        this.id = id;
        this.salary = salary;
    }

    // Getter và Setter cho id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // Getter và Setter cho salary
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Phương thức toString để trả về thông tin của Employee
    @Override
    public String toString() {
        // Gọi toString của lớp Person và thêm thông tin của Employee
        return super.toString() + ", ID: " + id + ", Salary: " + salary;
    }
}
