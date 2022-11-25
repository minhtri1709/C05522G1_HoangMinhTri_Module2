package exam.model;

public abstract class Vehicle {
    private String codeOfVehicle;
    private String nameOfVehicle;
    private String nameOfManufacturer;
    private String year;
    private int wattage;
    private int areaOfSylanh;

    public Vehicle() {
    }

    public Vehicle(String codeOfVehicle, String nameOfVehicle, String nameOfManufacturer, String year, int wattage, int areaOfSylanh) {
        this.codeOfVehicle = codeOfVehicle;
        this.nameOfVehicle = nameOfVehicle;
        this.nameOfManufacturer = nameOfManufacturer;
        this.year = year;
        this.wattage = wattage;
        this.areaOfSylanh = areaOfSylanh;
    }

    public String getCodeOfVehicle() {
        return codeOfVehicle;
    }

    public void setCodeOfVehicle(String codeOfVehicle) {
        this.codeOfVehicle = codeOfVehicle;
    }

    public String getNameOfVehicle() {
        return nameOfVehicle;
    }

    public void setNameOfVehicle(String nameOfVehicle) {
        this.nameOfVehicle = nameOfVehicle;
    }

    public String getNameOfManufacturer() {
        return nameOfManufacturer;
    }

    public void setNameOfManufacturer(String nameOfManufacturer) {
        this.nameOfManufacturer = nameOfManufacturer;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getWattage() {
        return wattage;
    }

    public void setWattage(int wattage) {
        this.wattage = wattage;
    }

    public int getAreaOfSylanh() {
        return areaOfSylanh;
    }

    public void setAreaOfSylanh(int areaOfSylanh) {
        this.areaOfSylanh = areaOfSylanh;
    }


    @Override
    public String toString() {
        return "Vehicle{" +
                "codeOfVehicle='" + codeOfVehicle + '\'' +
                ", nameOfVehicle='" + nameOfVehicle + '\'' +
                ", nameOfManufacturer='" + nameOfManufacturer + '\'' +
                ", year='" + year + '\'' +
                ", wattage=" + wattage +
                ", areaOfSylanh=" + areaOfSylanh +
                '}';
    }

    public abstract String getInfo();
}
