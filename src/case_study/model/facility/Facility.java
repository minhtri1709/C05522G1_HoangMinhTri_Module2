package case_study.model.facility;

public abstract class Facility {
    private String idService;
    private String nameOfService;
    private int area;
    private String price;
    private int maxPeopleInRoom;
    private String kindOfRent;


    public Facility() {
    }


    public Facility(String idService, String nameOfService, int area, String price, int maxPeopleInRoom, String kindOfRent) {
        this.idService = idService;
        this.nameOfService = nameOfService;
        this.area = area;
        this.price = price;
        this.maxPeopleInRoom = maxPeopleInRoom;
        this.kindOfRent = kindOfRent;
    }

    public String getNameOfService() {
        return nameOfService;
    }

    public void setNameOfService(String nameOfService) {
        this.nameOfService = nameOfService;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getMaxPeopleInRoom() {
        return maxPeopleInRoom;
    }

    public void setMaxPeopleInRoom(int maxPeopleInRoom) {
        this.maxPeopleInRoom = maxPeopleInRoom;
    }

    public String getKindOfRent() {
        return kindOfRent;
    }

    public void setKindOfRent(String kindOfRent) {
        this.kindOfRent = kindOfRent;
    }

    public String getIdService() {
        return idService;
    }

    public void setIdService(String idService) {
        this.idService = idService;
    }

    public abstract String getInfo();



    @Override
    public String toString() {
        return
                "idService='" + idService + '\'' +
                ", nameOfService='" + nameOfService + '\'' +
                ", area=" + area +
                ", price='" + price + '\'' +
                ", maxPeopleInRoom=" + maxPeopleInRoom +
                ", kindOfRent='" + kindOfRent + '\''
                ;
    }
}
