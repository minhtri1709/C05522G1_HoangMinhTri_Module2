package exam.model;

public class Car extends Vehicle {
    private int seat;
    private String kindOfCar;

    public Car() {
    }

    public Car(String codeOfVehicle,
               String nameOfVehicle,
               String nameOfManufacturer,
               String year,
               int wattage,
               int areaOfSylanh,
               int seat,
               String kindOfCar) {
        super(codeOfVehicle, nameOfVehicle, nameOfManufacturer, year, wattage, areaOfSylanh);
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
        return "Car{" +
                "seat=" + seat +
                ", kindOfCar='" + kindOfCar + '\'' +
                "} " + super.toString();
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s", this.getCodeOfVehicle(),
                this.getNameOfVehicle(),
                this.getNameOfManufacturer(),
                this.getYear(),
                this.getWattage(),
                this.getAreaOfSylanh(),
                this.getSeat(),
                this.getKindOfCar());
    }
}
