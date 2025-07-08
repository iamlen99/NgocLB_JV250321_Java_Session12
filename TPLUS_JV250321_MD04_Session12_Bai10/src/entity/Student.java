package entity;

public class Student {
    private int id;
    private String name;
    private double avgScore;

    public Student(int id, String name, double avgScore) {
        this.id = id;
        this.name = name;
        this.avgScore = avgScore;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(double avgScore) {
        this.avgScore = avgScore;
    }

    @Override
    public String toString() {
        return String.format("ID: %d - Ten: %s - DTB: %.1f", this.id, this.name, this.avgScore);
    }
}
