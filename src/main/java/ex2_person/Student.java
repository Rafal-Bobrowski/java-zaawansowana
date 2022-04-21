package ex2_person;

public class Student extends Person{
    private String studiesType;
    private int studiesYear;
    private float studiesCost;

    public Student(String studiesType, int studiesYear, float studiesCost) {
        this.studiesType = studiesType;
        this.studiesYear = studiesYear;
        this.studiesCost = studiesCost;
    }

    public Student(String name, String address, String studiesType, int studiesYear, float studiesCost) {
        super(name, address);
        this.studiesType = studiesType;
        this.studiesYear = studiesYear;
        this.studiesCost = studiesCost;
    }

    public String getStudiesType() {
        return studiesType;
    }

    public void setStudiesType(String studiesType) {
        this.studiesType = studiesType;
    }

    public int getStudiesYear() {
        return studiesYear;
    }

    public void setStudiesYear(int studiesYear) {
        this.studiesYear = studiesYear;
    }

    public float getStudiesCost() {
        return studiesCost;
    }

    public void setStudiesCost(int studiesCost) {
        this.studiesCost = studiesCost;
    }

    @Override
    public String toString() {
        return "ex2_person.Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", studiesType='" + studiesType + '\'' +
                ", studiesYear=" + studiesYear +
                ", studiesCost=" + studiesCost +
                '}';
    }
}
