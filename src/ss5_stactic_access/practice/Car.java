package ss5_stactic_access.practice;

public class Car {
    private String name;
    private String engine;

    public static int numberOfCars;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public Car(String name, String engine){
        this.name = name;
        this.engine = engine;
        numberOfCars++;
    }

    void  display(){
        System.out.printf(" %s, %s \n",name, engine  );
    }
}
