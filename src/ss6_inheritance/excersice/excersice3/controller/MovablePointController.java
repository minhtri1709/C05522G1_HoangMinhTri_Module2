package ss6_inheritance.excersice.excersice3.controller;

import ss6_inheritance.excersice.excersice3.model.MovablePoint;

public class MovablePointController {
    public static void main(String[] args) {
        MovablePoint moveablePoint = new MovablePoint(10,20);
        System.out.println(moveablePoint);
        System.out.println(moveablePoint.move());

        MovablePoint moveablePoint1 = new MovablePoint(3,4,5,6);
        System.out.println(moveablePoint1);
        System.out.println(moveablePoint1.move());
        System.out.println(moveablePoint1.move());
        System.out.println(moveablePoint1.move());
        System.out.println(moveablePoint1.move());
    }
}
