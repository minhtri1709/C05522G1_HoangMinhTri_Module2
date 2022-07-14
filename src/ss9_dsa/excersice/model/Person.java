package ss9_dsa.excersice.model;

public abstract class Person {
    private int id;
    private String name;
    private String dayOfBirth;
    private String sex;
    private static String nameSchool;

    public Person() {
    }

    public Person(int id, String name,String sex, String dayOfBirth) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.dayOfBirth = dayOfBirth;
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

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dayOfBirth='" + dayOfBirth + '\'' +
                '}';
    }
}
