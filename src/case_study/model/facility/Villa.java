package case_study.model.facility;

import case_study.model.facility.Facility;

public class Villa extends Facility {

    private String typeOfRoom;
    private int areaOfPool;
    private int floor;


    public Villa() {
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s", super.getIdService(), super.getNameOfService(), +
                        super.getArea(), super.getPrice(), super.getMaxPeopleInRoom(), super.getKindOfRent(), this.typeOfRoom,
                this.areaOfPool, this.floor);
    }

    public Villa(String idService, String nameOfService, int area, String price, int maxPeopleInRoom
            , String kindOfRent, String typeOfRoom, int areaOfPool, int floor) {
        super(idService, nameOfService, area, price, maxPeopleInRoom, kindOfRent);
        this.typeOfRoom = typeOfRoom;
        this.areaOfPool = areaOfPool;
        this.floor = floor;
    }

    public String getTypeOfRoom() {
        return typeOfRoom;
    }

    public void setTypeOfRoom(String typeOfRoom) {
        this.typeOfRoom = typeOfRoom;
    }

    public int getAreaOfPool() {
        return areaOfPool;
    }

    public void setAreaOfPool(int areaOfPool) {
        this.areaOfPool = areaOfPool;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }


    @Override
    public String toString() {
        return "Villa{" +
                "typeOfRoom='" + typeOfRoom + '\'' +
                ", areaOfPool=" + areaOfPool +
                ", floor=" + floor +
                 super.toString();
    }
}
