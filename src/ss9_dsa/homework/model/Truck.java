package ss9_dsa.homework.model;

public class Truck extends Vehicle {
    private int tonnage;

    public Truck() {
    }



    public Truck(String vehicleNumber, String manufacturerName, int yearOfManufacture, String nameOfOwner, int tonnage) {
        super(vehicleNumber, manufacturerName, yearOfManufacture, nameOfOwner);
        this.tonnage = tonnage;
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
