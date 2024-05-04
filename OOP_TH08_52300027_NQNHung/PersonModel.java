import java.util.ArrayList;

class PersonModel<T> {
    private ArrayList<T> al = new ArrayList<T>();

    public void add(T obj) {
        al.add(obj);
    }

    public void display() {
        for (T obj : al) {
            System.out.println(obj);
        }
    }

    public static void main(String[] args) {
        PersonModel<Student> studentModel = new PersonModel<Student>();
        studentModel.add(new Student("Student One", 2000, "S100", 3.5));
        studentModel.add(new Student("Student Two", 2001, "S101", 3.9));
        System.out.println("Displaying Students:");
        studentModel.display();

        PersonModel<Employee> employeeModel = new PersonModel<Employee>();
        employeeModel.add(new Employee("Employee One", 1985, "E100", 55000.0));
        employeeModel.add(new Employee("Employee Two", 1990, "E101", 60000.0));
        System.out.println("\nDisplaying Employees:");
        employeeModel.display();

        PersonModel<Person> personModel = new PersonModel<Person>();
        personModel.add(new Person("Person One", 1970));
        personModel.add(new Person("Person Two", 1980));
        System.out.println("\nDisplaying People:");
        personModel.display();
    }
}