package ss6_inheritance.excersice.excersice1.controller;

import ss6_inheritance.excersice.excersice1.model.Cylinder;

public class CylinderTestController {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        cylinder = new Cylinder(3.0, "Blue" , 3.0);

        System.out.println(cylinder);

    }
}
