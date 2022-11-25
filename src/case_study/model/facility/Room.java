package case_study.model.facility;

import case_study.model.facility.Facility;

public class Room extends Facility {
  private String freeService;


    public Room() {

    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s"
                , super.getIdService()
                , super.getNameOfService()
                , super.getArea()
                , super.getPrice()
                , super.getMaxPeopleInRoom()
                , super.getKindOfRent()
                , this.freeService);
    }

    public Room(String idService, String nameOfService, int area, String price, int maxPeopleInRoom, String kindOfRent, String freeService) {
        super(idService, nameOfService, area, price, maxPeopleInRoom, kindOfRent);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" +
                "freeService='" + freeService + '\''
                 + super.toString();
    }
}
