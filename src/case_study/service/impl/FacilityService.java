package case_study.service.impl;

import case_study.model.facility.Facility;
import case_study.model.facility.House;
import case_study.model.facility.Room;
import case_study.model.facility.Villa;
import case_study.service.IFacilityService;
import case_study.utils.ReadFileFacilityUtils;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityService implements IFacilityService {
    private static final Map<Facility, Integer> facilityList = new LinkedHashMap<>();
    private static final String PATH_HOUSE = "case_study/data/HouseFileData.csv";
    private static final String PATH_ROOM = "case_study/data/RoomFileData.csv";
    private static final String PATH_VILLA = "case_study/data/VillaFileData.csv";
    private static  Scanner scanner = new Scanner(System.in);

    @Override
    public void add() {
        do {
            System.out.println("1. Add New Villa\n" +
                    "2. Add New House\n" +
                    "3. Add New Room\n" +
                    "4. Back to menu.");

            System.out.println("Please input your choice: ");
            int option = Integer.parseInt(scanner.nextLine());

            switch (option) {
                case 1: {
                    Map<Facility, Integer> houseList = ReadFileFacilityUtils.readFacilityFile(PATH_HOUSE);

                    System.out.println("Please input ID service: ");
                    String idService = scanner.nextLine();

                    System.out.println("Please intput name of service: ");
                    String nameOfService = scanner.nextLine();


                    System.out.println("Please input area of house: ");
                    int area = Integer.parseInt(scanner.nextLine());

                    System.out.println("Please input the price of house:  ");
                    String price = scanner.nextLine();

                    System.out.println("Please the max of number in room:  ");
                    int people = Integer.parseInt(scanner.nextLine());

                    System.out.println("Please input the kind of rent:  ");
                    String kindOfRent = scanner.nextLine();

                    System.out.println("Please input the type of room:  ");
                    String typeOfRoom = scanner.nextLine();

                    System.out.println("Please input the total foor in house:  ");
                    int floor = Integer.parseInt(scanner.nextLine());


                    House house = new House(idService, nameOfService, area, price, people, kindOfRent, typeOfRoom, floor);
                    houseList.put(house, 0);
                    ReadFileFacilityUtils.writeFacility(PATH_HOUSE, houseList);
                    System.out.println("The addition is complete");
                    return;
                }
                case 2: {
                    Map<Facility, Integer> roomList = ReadFileFacilityUtils.readFacilityFile(PATH_ROOM);

                    System.out.println("Please input ID service: ");
                    String idService = scanner.nextLine();

                    System.out.println("Please intput name of service: ");
                    String nameOfService = scanner.nextLine();

                    System.out.println("Please input area of house: ");
                    int area = Integer.parseInt(scanner.nextLine());

                    System.out.println("Please input the price of house:  ");
                    String price = scanner.nextLine();

                    System.out.println("Please the max of number in room:  ");
                    int people = Integer.parseInt(scanner.nextLine());

                    System.out.println("Please input the kind of rent:  ");
                    String kindOfRent = scanner.nextLine();

                    System.out.println("Please input free service:  ");
                    String freeService = scanner.nextLine();

                    Room room = new Room(idService, nameOfService, area, price, people, kindOfRent, freeService);
                    roomList.put(room, 0);
                    ReadFileFacilityUtils.writeFacility(PATH_ROOM, roomList);
                    System.out.println("The addition is complete");
                    return;
                }
                case 3: {
                    Map<Facility, Integer> villaList = ReadFileFacilityUtils.readFacilityFile(PATH_VILLA);

                    System.out.println("Please input ID service: ");
                    String idService = scanner.nextLine();

                    System.out.println("Please intput name of service: ");
                    String nameOfService = scanner.nextLine();

                    System.out.println("Please input area of house: ");
                    int area = Integer.parseInt(scanner.nextLine());

                    System.out.println("Please input the price of house:  ");
                    String price = scanner.nextLine();

                    System.out.println("Please the max of number in room:  ");
                    int people = Integer.parseInt(scanner.nextLine());

                    System.out.println("Please input the kind of rent:  ");
                    String kindOfRent = scanner.nextLine();

                    System.out.println("Please input type of room: ");
                    String typeOfRoom = scanner.nextLine();

                    System.out.println("Please input area of room:  ");
                    int areaOfPool = Integer.parseInt(scanner.nextLine());

                    System.out.println("Please input the floor where room at:  ");
                    int floor = Integer.parseInt(scanner.nextLine());

                    Villa villa = new Villa(idService, nameOfService, area, price, people, kindOfRent, typeOfRoom, areaOfPool, floor);
                    villaList.put(villa, 0);
                    ReadFileFacilityUtils.writeFacility(PATH_VILLA, villaList);
                    System.out.println("The addition is complete");
                    return;
                }
            }
        } while (true);
    }


    @Override
    public void display() {
        System.out.println("Facilities List: ");

        System.out.println("1- Villa List: : ");
        Map<Facility, Integer> villaList = ReadFileFacilityUtils.readFacilityFile(PATH_VILLA);
        for (Facility villa : villaList.keySet()) {
            System.out.println(villa + ",\tTotal of used: " + villaList.get(villa));
        }

        System.out.println("2- House List: ");
        Map<Facility, Integer> houseList = ReadFileFacilityUtils.readFacilityFile(PATH_HOUSE);
        for (Facility house : houseList.keySet()) {
            System.out.println(house + ",\tTotal of used:: " + houseList.get(house));
        }

        System.out.println("3- Room List: ");
        Map<Facility, Integer> roomList = ReadFileFacilityUtils.readFacilityFile(PATH_ROOM);
        for (Facility room : roomList.keySet()) {
            System.out.println(room + ",\tTotal of used: " + roomList.get(room));
        }
    }

    @Override
    public void edit() {
    }

    @Override
    public void displayMaintenance() {
        System.out.println("Facilty Maintence List: ");

        System.out.println("1- Villa List: ");
        Map<Facility, Integer> villaList = ReadFileFacilityUtils.readFacilityFile(PATH_VILLA);
        for (Facility villa : villaList.keySet()) {
            if (villaList.get(villa) > 4) {
                System.out.println(villa + " | Total of used: " + villaList.get(villa));
            }
        }

        System.out.println("2. House List: ");
        Map<Facility, Integer> houseList = ReadFileFacilityUtils.readFacilityFile(PATH_HOUSE);
        for (Facility house : houseList.keySet()) {
            if (houseList.get(house) > 4) {
                System.out.println(house + " | Total of used: " + houseList.get(house));
            }
        }

        System.out.println("3. Room List: ");
        Map<Facility, Integer> roomList = ReadFileFacilityUtils.readFacilityFile(PATH_ROOM);
        for (Facility room : roomList.keySet()) {
            if (roomList.get(room) > 4) {
                System.out.println(room + " | Total of used: " + roomList.get(room));
            }
        }
    }
}

