package ss6_inheritance.excersice.excersice2.controller;

import ss6_inheritance.excersice.excersice2.model.Point3D;

public class Point3DTestController {
    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        System.out.println(point3D);

        Point3D point3D1 = new Point3D(5,4,5);
        System.out.println(point3D1);
    }
}
