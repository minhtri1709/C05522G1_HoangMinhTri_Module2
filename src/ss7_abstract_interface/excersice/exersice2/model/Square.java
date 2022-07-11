package ss7_abstract_interface.excersice.exersice2.model;

import ss7_abstract_interface.excersice.exersice2.service.Colorable;

public class Square extends Shape implements Colorable {

    private int side = 5;

    public Square() {
    }

    public Square(int side) {
        this.side = side;
    }

    public Square(String color, boolean filled) {
        super(color, filled);
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int getArea(){
      return side * side;
    }

    @Override
    public String toString() {
        return "A Shape with color of "
                + getColor()
                + " and "
                +" area is " + getArea()
                + (isFilled() ? "filled" : "not filled");
    }


    @Override
    public String howToColor() {
        return "Color all four sides.";
    }
}
