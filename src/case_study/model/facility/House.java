package case_study.model.facility;

import case_study.model.facility.Facility;

public class House extends Facility {
    private String typeOfRoom;
    private int floor;

    public House() {
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s",
                this.getIdService(),
                this.getNameOfService(),
                this.getArea(),
                this.getPrice(),
                this.getMaxPeopleInRoom(),
                this.getKindOfRent(),
                this.getTypeOfRoom(),
                this.getFloor());
    }

    public House(String idService, String nameOfService, int area,
                 String price, int maxPeopleInRoom,
                 String kindOfRent, String typeOfRoom, int floor) {
        super(idService, nameOfService, area, price, maxPeopleInRoom, kindOfRent);
        this.typeOfRoom = typeOfRoom;
        this.floor = floor;
    }

    public String getTypeOfRoom() {
        return typeOfRoom;
    }

    public void setTypeOfRoom(String typeOfRoom) {
        this.typeOfRoom = typeOfRoom;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "House{" +
                "typeOfRoom='" + typeOfRoom + '\'' +
                ", floor=" + floor +
                " " + super.toString();
    }
}
