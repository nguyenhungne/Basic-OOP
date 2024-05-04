public class Manager extends Employee {
    private String position = "head of the administrative office";
    private double salaryCoefficientPosition = 5.0;

    public Manager() {}

    public Manager(String ID, String fullName, double coefficientsSalary, String position, double salaryCoefficientPosition) {
        super(ID, fullName, 2024, coefficientsSalary, 0 );
        this.position = position;
        this.salaryCoefficientPosition = salaryCoefficientPosition;
    }

    public Manager(String ID, String fullName, double coefficientsSalary, int yearJoined, int numDaysOff, String position, double salaryCoefficientPosition) {
        super(ID, fullName, yearJoined, coefficientsSalary, numDaysOff);
        this.position = position;
        this.salaryCoefficientPosition = salaryCoefficientPosition;
    }

    @Override
    public String considerEmulation() {
        return "A";
    }

    public double bonusByPosition() {
        return super.getSalary() * this.salaryCoefficientPosition;
    }

    @Override
    public double getSalary() {
        double basicSalary = super.getSalary();
        double senioritySalary = super.getSenioritySalary();
        double positionBonus = this.bonusByPosition();
        return basicSalary + basicSalary * (this.coefficientsSalary + this.salaryCoefficientPosition) + senioritySalary + positionBonus;
    }
}