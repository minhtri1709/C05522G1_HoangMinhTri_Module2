package case_study.model.facility;

public abstract class Facility {
    String typeOfFacility;
    int area;
    int bedTypes;
    String bathroom;

    public Facility() {
    }

    public Facility(String typeOfFacility, int area, int bedTypes, String bathroom) {
        this.typeOfFacility = typeOfFacility;
        this.area = area;
        this.bedTypes = bedTypes;
        this.bathroom = bathroom;
    }

    public String getTypeOfFacility() {
        return typeOfFacility;
    }

    public void setTypeOfFacility(String typeOfFacility) {
        this.typeOfFacility = typeOfFacility;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getBed() {
        return bedTypes;
    }

    public void setBed(int bedTypes) {
        this.bedTypes = bedTypes;
    }

    public String getBathroom() {
        return bathroom;
    }

    public void setBathroom(String bathroom) {
        this.bathroom = bathroom;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "typeOfFacility='" + typeOfFacility + '\'' +
                ", area=" + area +
                ", bedTypes=" + bedTypes +
                ", bathroom='" + bathroom + '\'' +
                '}';
    }
}
