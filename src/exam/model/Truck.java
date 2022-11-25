package exam.model;

public class Truck extends Vehicle {
    private int tonnage;

    public Truck() {
    }

    public Truck(String codeOfVehicle,
                 String nameOfVehicle,
                 String nameOfManufacturer,
                 String year,
                 int wattage,
                 int areaOfSylanh,
                 int tonnage) {
        super(codeOfVehicle, nameOfVehicle, nameOfManufacturer, year, wattage, areaOfSylanh);
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
        return
                "tonnage=" + tonnage +
                        "} " + super.toString();
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s", this.getCodeOfVehicle(),
                this.getNameOfVehicle(),
                this.getNameOfManufacturer(),
                this.getYear(),
                this.getWattage(),
                this.getAreaOfSylanh(),
                this.getTonnage());
    }
}
