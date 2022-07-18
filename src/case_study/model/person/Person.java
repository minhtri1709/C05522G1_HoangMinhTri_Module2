package case_study.model.person;

public abstract class Person {

     String name;
     String dayOfBirth;
     String province;
     String id;

    public Person() {
    }

    public Person(String name, String dayOfBirth, String province, String id) {
        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.province = province;
        this.id =id;
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

    public void setAge(int age) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", dayOfBirth='" + dayOfBirth + '\'' +
                ", province='" + province + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
