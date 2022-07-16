package ss9_dsa.homework.model;

public class Motobike extends Vehicle {
    private int wattage;

    public Motobike() {
    }

    public Motobike(String vehicleNumber, String manufacturerName, int yearOfManufacture, String nameOfOwner, int wattage) {
        super(vehicleNumber, manufacturerName, yearOfManufacture, nameOfOwner);
    }

    public int getWattage() {
        return wattage;
    }

    public void setWattage(int wattage) {
        this.wattage = wattage;
    }

    @Override
    public String toString() {
        return "MotobikeClass{" +
                "wattage=" + wattage +
                "} " + super.toString();
    }
}
