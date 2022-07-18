package case_study.model.facility;

import case_study.model.facility.Facility;

public class Villa extends Facility {
    private String pool;
    private String  grassGarden;

    public Villa() {

    }

    public Villa(String typeOfFacility, int area, int bedTypes, String bathroom, String pool, String grassGarden) {
        super(typeOfFacility, area, bedTypes, bathroom);
        this.pool = pool;
        this.grassGarden = grassGarden;
    }

    public String getPool() {
        return pool;
    }

    public void setPool(String pool) {
        this.pool = pool;
    }

    public String getGrassGarden() {
        return grassGarden;
    }

    public void setGrassGarden(String grassGarden) {
        this.grassGarden = grassGarden;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "pool='" + pool + '\'' +
                ", grassGarden='" + grassGarden + '\'' +
                "} " + super.toString();
    }
}
