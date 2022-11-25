package case_study.model.person;

public class Employee extends Person {
    private String employeeCode;
    private String level;
    private String position;
    private String salary;

    public Employee() {
    }

    public Employee(String employeeCode,
                    String name,
                    String dayOfBirth,
                    String id,
                    String phoneNumber,
                    String email,
                    String sex,
                    String level,
                    String position,
                    String salary) {
        super(name, dayOfBirth, id, phoneNumber, email, sex);
        this.employeeCode = employeeCode;
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return
                " employeeCode= " + employeeCode +
                        super.toString() +
                        ", level='" + level + '\'' +
                        ", position='" + position + '\'' +
                        ", salary='" + salary;
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s",
                this.getEmployeeCode(),
                this.getName(),
                this.getDayOfBirth(),
                this.getId(),
                this.getPhoneNumber(),
                this.getEmail(),
                this.getSex(),
                this.getLevel(),
                this.getPosition(),
                this.getSalary());

    }
}
