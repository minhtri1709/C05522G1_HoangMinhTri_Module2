package ss7_abstract_interface.excersice.exersice2.controller;

import ss7_abstract_interface.excersice.exersice2.model.Circle;
import ss7_abstract_interface.excersice.exersice2.model.Rectangle;
import ss7_abstract_interface.excersice.exersice2.model.Shape;
import ss7_abstract_interface.excersice.exersice2.model.Square;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle();
        shapes[1] = new Square();
        shapes[2] = new Rectangle();

        for (Shape shape : shapes){
            System.out.println(shape);

            if (shape instanceof Square){
                Shape shape1 = (Square) shape;
                System.out.println(shape1.howToColor());
            }
        }
    }
}
