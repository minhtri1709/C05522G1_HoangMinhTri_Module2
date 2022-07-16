package ss9_dsa.homework.model;

public abstract class VehicleClass {
    private String vehicleNumber;
    private String manufacturerName;
    private int yearOfManufacture;
    private String nameOfOwner;


    public VehicleClass(){}

    public VehicleClass(String vehicleNumber, String manufacturerName, int yearOfManufacture, String nameOfOwner) {
        this.vehicleNumber = vehicleNumber;
        this.manufacturerName = manufacturerName;
        this.yearOfManufacture = yearOfManufacture;
        this.nameOfOwner = nameOfOwner;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getNameOfOwner() {
        return nameOfOwner;
    }

    public void setNameOfOwner(String nameOfOwner) {
        this.nameOfOwner = nameOfOwner;
    }

    @Override
    public String toString() {
        return "VehicleClass{" +
                "vehicleNumber='" + vehicleNumber + '\'' +
                ", manufacturerName='" + manufacturerName + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                ", nameOfOwner='" + nameOfOwner + '\'' +
                '}';
    }
}
