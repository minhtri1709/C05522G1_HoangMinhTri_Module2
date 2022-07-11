package ss7_abstract_interface.excersice.exersice1.controller;

import ss7_abstract_interface.excersice.exersice1.model.Shape;
import ss7_abstract_interface.excersice.exersice1.model.Circle;
import ss7_abstract_interface.excersice.exersice1.model.Rectangle;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();

        for (Shape shape : shapes) {
            System.out.println("Shapes before change" + shape);
            if (shape instanceof Circle){
                Shape shape1 = (Circle) shape;
                System.out.println(shape1.resize( 20));
            }

        }
        }

}
