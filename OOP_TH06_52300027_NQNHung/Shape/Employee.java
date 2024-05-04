import java.time.Year;

public class Employee {
    protected String ID;
    protected String fullName;
    protected int yearJoined;
    protected double coefficientsSalary;
    protected int numDaysOff;

    public Employee() {
        this.ID = "0";
        this.fullName = "";
        this.yearJoined = 2020;
        this.coefficientsSalary = 1.0;
        this.numDaysOff = 0;
    }

    public Employee(String ID, String fullName, double coefficientsSalary) {
        this.ID = ID;
        this.fullName = fullName;
        this.coefficientsSalary = coefficientsSalary;
        this.yearJoined = 2020;
        this.numDaysOff = 0;
    }
    
    
    public Employee(String ID, String fullName, int yearJoined, double coefficientsSalary, int numDaysOff) {
        this.ID = ID;
        this.fullName = fullName;
        this.yearJoined = yearJoined;
        this.coefficientsSalary = coefficientsSalary;
        this.numDaysOff = numDaysOff;
    }

    public double getSenioritySalary() {
        int currentYear = Year.now().getValue();
        int yearsOfWork = currentYear - this.yearJoined;

        if (yearsOfWork >= 5) {
            return yearsOfWork * this.coefficientsSalary / 100;
        } else {
            return 0;
        }
    }

    public String considerEmulation() {
        if (this.numDaysOff <= 1) {
            return "A";
        } else if (this.numDaysOff <= 3) {
            return "B";
        } else {
            return "C";
        }
    }

    public double getSalary() {
        if (this.considerEmulation().equals("A")) {
            return 1.0;
        }
         
        if (this.considerEmulation().equals("B")) {
            return 0.75;
        }

        if (this.considerEmulation().equals("C")){
            return 0.75;
        }

        return 0;
    }


}