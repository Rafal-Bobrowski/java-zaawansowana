package oop.ex2_person;

public class Staff extends Person{
    private String specialization;
    private float salary;

    public Staff(String specialization, float salary) {
        this.specialization = specialization;
        this.salary = salary;
    }

    public Staff(String name, String address, String specialization, float salary) {
        super(name, address);
        this.specialization = specialization;
        this.salary = salary;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "ex2_person.Staff{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", specialization='" + specialization + '\'' +
                ", salary=" + salary +
                '}';
    }
}
