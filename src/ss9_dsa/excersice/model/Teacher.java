package ss9_dsa.excersice.model;

public class Teacher extends Person{
    private String specialize;

    public Teacher() {
    }

    public Teacher(int id, String name, String sex, String dayOfBirth, String specialize) {
        super(id, name, sex, dayOfBirth);
        this.specialize = specialize;
    }

    public String getSpecialize() {
        return specialize;
    }

    public void setSpecialize(String specialize) {
        this.specialize = specialize;
    }
}
