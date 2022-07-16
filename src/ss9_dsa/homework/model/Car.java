package ss9_dsa.homework.model;

public class Car extends Vehicle {
    private int seat;
    private String kindOfCar;

    public Car() {

    }

    public Car(String vehicleNumber, String manufacturerName, int yearOfManufacture, String nameOfOwner, int seat, String kindOfCar) {
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
