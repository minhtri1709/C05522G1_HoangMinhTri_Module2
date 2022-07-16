package ss9_dsa.homework.model;

public class TruckClass extends VehicleClass{
    private int tonnage;

    public TruckClass() {
    }

    public TruckClass(String vehicleNumber, String manufacturerName, int yearOfManufacture, String nameOfOwner) {
        super(vehicleNumber, manufacturerName, yearOfManufacture, nameOfOwner);
    }

    public int getTonnage() {
        return tonnage;
    }

    public void setTonnage(int tonnage) {
        this.tonnage = tonnage;
    }

    @Override
    public String toString() {
        return "TruckClass{" +
                "tonnage=" + tonnage +
                "} " + super.toString();
    }
}
