package case_study.model.facility;

import case_study.model.facility.Facility;

public class House extends Facility {
    private int floor;

    public House() {
    }

    public House(String typeOfFacility, int area, int bedTypes, String bathroom, int floor) {
        super(typeOfFacility, area, bedTypes, bathroom);
        this.floor = floor;
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
                "floor=" + floor +
                "} " + super.toString();
    }
}
