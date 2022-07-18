package case_study.model.person;

public class Employee extends Person{
    private String id;
    private int salary;
    private String position;

    public Employee() {
    }

    public Employee(String name, String dayOfBirth, String province, String id) {
        super(name, dayOfBirth, province, id);
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", salary=" + salary +
                ", position='" + position + '\'' +
                "} " + super.toString();
    }
}
