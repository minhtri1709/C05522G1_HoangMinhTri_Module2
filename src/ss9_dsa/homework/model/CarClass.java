package ss9_dsa.homework.model;

public class CarClass extends VehicleClass{
    private int seat;
    private String kindOfCar;

    public CarClass() {

    }

    public CarClass(String vehicleNumber, String manufacturerName, int yearOfManufacture, String nameOfOwner, int seat, String kindOfCar) {
        super(vehicleNumber, manufacturerName, yearOfManufacture, nameOfOwner);
        this.seat = seat;
        this.kindOfCar = kindOfCar;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public String getKindOfCar() {
        return kindOfCar;
    }

    public void setKindOfCar(String kindOfCar) {
        this.kindOfCar = kindOfCar;
    }

    @Override
    public String toString() {
        return "CarClass{" +
                "seat=" + seat +
                ", kindOfCar='" + kindOfCar + '\'' +
                "} " + super.toString();
    }
}
