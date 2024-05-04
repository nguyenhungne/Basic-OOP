class Student extends Person {
    private String id;
    private double score;

    // Constructor
    public Student(String name, int birthYear, String id, double score) {
        super(name, birthYear);
        this.id = id;
        this.score = score;
    }

    // Getters và Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public double getScore() { return score; }
    public void setScore(double score) { this.score = score; }

    // Phương thức toString
    @Override
    public String toString() {
        return super.toString() + ", ID: " + id + ", Score: " + score;
    }
}