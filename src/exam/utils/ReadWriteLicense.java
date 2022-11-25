package exam.utils;

import case_study.utils.ReadWriteFIleUtils;
import exam.model.License;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReadWriteLicense {
    public static List<String> readFile(String path) {
        List<String> stringList = new ArrayList<>();
        try {
            File file = new File(path);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            FileReader fileReader = new FileReader(file);

            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("File is not found!!");
        }
        return stringList;
    }


    public static List<License> readLicense(String path) {
        List<License> licenseList = new LinkedList<>();

        List<String> stringList = ReadWriteFIleUtils.readFile(path);
        String[] info;

        for (String line : stringList) {
            info = line.split(",");
            licenseList.add(new License(Integer.parseInt(info[0]), info[1], info[2], info[3]));
        }

        return licenseList;
    }



    public static void writeLicense(String path, List<License> licenseList) {
        StringBuilder data = new StringBuilder();
        for (License license : licenseList) {
            data.append(license.getInfo()).append("\n");
        }
        try {
            ReadWriteFIleUtils.writeFile(path, data.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void writeFile(String path, String data) throws IOException {
        File file = new File(path);
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(data);
        bufferedWriter.close();
    }
}