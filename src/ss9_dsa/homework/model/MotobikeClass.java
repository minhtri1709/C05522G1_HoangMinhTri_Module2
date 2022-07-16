package ss9_dsa.homework.model;

public class MotobikeClass extends VehicleClass{
    private int wattage;

    public MotobikeClass() {
    }

    public MotobikeClass(String vehicleNumber, String manufacturerName, int yearOfManufacture, String nameOfOwner) {
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
