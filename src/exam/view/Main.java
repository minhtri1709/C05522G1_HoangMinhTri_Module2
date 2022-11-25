package exam.view;

import exam.controller.CarMenuController;
import exam.controller.VehicleController;
import exam.model.Vehicle;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            VehicleController.menuController();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
