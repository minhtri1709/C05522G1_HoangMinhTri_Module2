package ss6_inheritance.excersice.excersice1.controller;

import ss6_inheritance.excersice.excersice1.model.Circle;

public class CircleTestController {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle = new Circle(2.0, "Red");

        System.out.println(circle);

    }
}
