package case_study.model.person;

public abstract class Person {

     private String name;
     private String dayOfBirth;
     private String id;
     private String phoneNumber;
     private String email;
     private String sex;

    public Person() {
    }

    public Person(String name, String dayOfBirth, String id, String phoneNumber, String email, String sex) {
        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.sex = sex;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return
                " name='" + name + '\'' +
                ", dayOfBirth='" + dayOfBirth + '\'' +
                ", id='" + id + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", sex='" + sex;
    }

    public abstract String getInfo();
}
