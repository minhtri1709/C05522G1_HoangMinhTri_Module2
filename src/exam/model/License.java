package exam.model;

public class License {
    private int id;
    private String nameOfOwner;
    private String dayBegin;
    private String codeOfCar;


    public License() {
    }

    public License(int id, String nameOfOwner, String dayBegin, String codeOfCar) {
        this.id = id;
        this.nameOfOwner = nameOfOwner;
        this.dayBegin = dayBegin;
        this.codeOfCar = codeOfCar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameOfOwner() {
        return nameOfOwner;
    }

    public void setNameOfOwner(String nameOfOwner) {
        this.nameOfOwner = nameOfOwner;
    }

    public String getDayBegin() {
        return dayBegin;
    }

    public void setDayBegin(String dayBegin) {
        this.dayBegin = dayBegin;
    }

    public String getCodeOfCar() {
        return codeOfCar;
    }

    public void setCodeOfCar(String codeOfCar) {
        this.codeOfCar = codeOfCar;
    }

    @Override
    public String toString() {
        return "License{" +
                "id=" + id +
                ", nameOfOwner='" + nameOfOwner + '\'' +
                ", dayBegin='" + dayBegin + '\'' +
                ", codeOfCar='" + codeOfCar + '\'' +
                '}';
    }

    public String getInfo(){
        return String.format("%s,%s,%s,%s", this.getId(),
                this.getNameOfOwner(),
                this.getDayBegin(),
                this.getCodeOfCar());
    }
}
