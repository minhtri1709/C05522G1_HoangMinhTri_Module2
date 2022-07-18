package case_study.model.facility;

import case_study.model.facility.Facility;

public class Room extends Facility {
    private String view;
    int roomNumber;


    public Room() {

    }

    public Room(String typeOfFacility, int area, int bedTypes, String bathroom, String view, int roomNumber) {
        super(typeOfFacility, area, bedTypes, bathroom);
        this.view = view;
        this.roomNumber =roomNumber;
    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public String toString() {
        return "Room{" +
                "view='" + view + '\'' +
                ", roomNumber=" + roomNumber +
                "} " + super.toString();
    }
}
