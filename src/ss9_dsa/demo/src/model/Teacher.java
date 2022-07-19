package ss9_dsa.demo.src.model;

public class Teacher extends Person{
    private String specialize;

    public Teacher() {
    }

    public Teacher(int id, String name, String dateOfBirth, String specialize) {
        super(id, name, dateOfBirth);
        this.specialize = specialize;
    }

    public String getSpecialize() {
        return specialize;
    }

    public void setSpecialize(String specialize) {
        this.specialize = specialize;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "specialize='" + specialize + '\'' +
                "} " + super.toString();
    }
}
