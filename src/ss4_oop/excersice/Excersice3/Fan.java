package ss4_oop.excersice.Excersice3;

public class Fan {
    boolean on;
    String color;
    int number;
    int radius;
    int speed;
    static final int SLOW = 1;
    static final int MEDIUM = 2;
    static final int FAST = 3;


    public Fan() {
    }

    private Fan(int number, int radius, String color, boolean on) {
        this.number = number;
        this.radius = radius;
        this.color = color;
        this.on = on;
    }

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public String getColor() {
        return color;
    }

    public int getRadius() {
        return radius;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String toString() {
        if (isOn()) {
            return "speed: " + getSpeed() + ", color: " + getColor() + ", radius: " + getRadius() + ", fan is on!";
        }

        return "color: " + getColor() + ", radius: " + getRadius() + ", fan is off!";
    }
}
