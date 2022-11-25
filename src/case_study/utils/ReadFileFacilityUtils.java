package case_study.utils;

import case_study.model.facility.Facility;
import case_study.model.facility.House;
import case_study.model.facility.Room;
import case_study.model.facility.Villa;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ReadFileFacilityUtils {
    private static List<String> readFile(String path) {
        List<String> stringList = new ArrayList<>();
        String line;
        try {
            File file = new File(path);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }

            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return stringList;
    }

    public static Map<Facility, Integer> readFacilityFile(String path) {
        List<String> stringList = readFile(path);
        Map<Facility, Integer> facilityList = new LinkedHashMap<>();
        String[] info;
        for (String line : stringList) {
            info = line.split(",");
            if (info.length == 10) {
                Facility villa = new Villa(info[0],
                        info[1],
                        Integer.parseInt(info[2]),
                        info[3],
                        Integer.parseInt(info[4]),
                        info[5], info[6],
                        Integer.parseInt(info[7]),
                        Integer.parseInt(info[8]));
                facilityList.put(villa, Integer.parseInt(info[9]));
            } else if (info.length == 9) {
                Facility house = new House(info[0], info[1],
                        Integer.parseInt(info[2]),
                        info[3],
                        Integer.parseInt(info[4]),
                        info[5], info[6],
                        Integer.parseInt(info[7]));
                facilityList.put(house, Integer.parseInt(info[8]));
            } else if (info.length == 8) {
                Facility room = new Room(info[0], info[1],
                        Integer.parseInt(info[2]),
                        info[3],
                        Integer.parseInt(info[4]),
                        info[5], info[6]);
                facilityList.put(room, Integer.parseInt(info[7]));
            }
        }

        return facilityList;
    }

    private static void writeFile(String path, String data) {
        try {
            File file = new File(path);
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(data);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeFacility(String path, Map<Facility, Integer> facilityMap) {
        StringBuilder data = new StringBuilder();
        for (Facility facility : facilityMap.keySet()) {
            data.append(facility.getInfo()).append(",").append(facilityMap.get(facility)).append("\n");
        }

        writeFile(path, data.toString());
    }
}
