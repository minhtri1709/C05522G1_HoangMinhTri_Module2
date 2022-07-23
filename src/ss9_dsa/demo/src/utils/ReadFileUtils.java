package ss9_dsa.demo.src.utils;

import ss9_dsa.demo.src.model.Student;
import ss9_dsa.demo.src.model.Teacher;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFileUtils {
    private static List<String> readFile(String path) throws IOException {
        File file = new File(path);
        FileReader reader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(reader);
        String line;
        List<String> strings = new ArrayList<>();

        while((line = bufferedReader.readLine()) != null){
            strings.add(line);

        }
        bufferedReader.close();
        return strings;
    }

    public static List<Student> readStudentFile(String path) throws IOException {
        List<String> strings = readFile(path);
        List<Student> studentList = new ArrayList<>();
        String[] info;

        for (String line : strings){
            info = line.split(",");
            studentList.add(new Student(Integer.parseInt(info[0]),info[1],info[2], Integer.parseInt(info[3]), info[4]));
        }
        return studentList;
    }

    public static List<Teacher> readTeacherFile(String path) throws IOException {
        List<String> strings = readFile(path);
        List<Teacher> teacherList = new ArrayList<>();
        String[] info;

        for (String line : strings){
            info = line.split(",");
            teacherList.add(new Teacher(Integer.parseInt(info[0]),info[1],info[2], info[3]));
        }
        return teacherList;
    }
}
