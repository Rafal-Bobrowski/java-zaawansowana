package reflection;

public class Student {
    private String name;
    private String lastName;
    private int index;
    private String studies;

    public Student() {
    }

    public Student(String name, String lastName, int index, String studies) {
        this.name = name;
        this.lastName = lastName;
        this.index = index;
        this.studies = studies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getStudies() {
        return studies;
    }

    public void setStudies(String studies) {
        this.studies = studies;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", index=" + index +
                ", studies='" + studies + '\'' +
                '}';
    }
}
