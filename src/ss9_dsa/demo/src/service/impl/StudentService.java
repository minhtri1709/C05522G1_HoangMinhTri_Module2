package ss9_dsa.demo.src.service.impl;

import ss9_dsa.demo.src.exception.DuplicateIDException;
import ss9_dsa.demo.src.model.Student;
import ss9_dsa.demo.src.service.IStudentService;
import ss9_dsa.demo.src.utils.ReadFileUtils;
import ss9_dsa.demo.src.utils.Utils;
import ss9_dsa.demo.src.utils.WriteFileUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
    private static List<Student> studentList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    private static String path = "ss9_dsa/demo/src/utils/FileStudent";

    public void addStudent() throws IOException {
        List<Student> studentList = ReadFileUtils.readStudentFile(path);
        Student student = infoStudent();
        studentList.add(student);
        WriteFileUtils.writeStudentFile(path, studentList);

        System.out.println("Thêm mới sinh viên thành công!. ");
    }

    @Override
    public void displayAllStudent() throws IOException {
        List<Student> studentList = ReadFileUtils.readStudentFile(path);
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    @Override
    public void removeStudent() throws IOException {

        System.out.println("Mời bạn nhập id của sinh viên cần xóa: ");
        int idRemove = Integer.parseInt(scanner.nextLine());
        boolean isExit = false;
        List<Student> studentList = ReadFileUtils.readStudentFile(path);

        for (Student student : studentList) {
            if (student.getId() == idRemove) {
                System.out.println(" Bạn có chắc muốn xóa hay không? \n" +
                        "1. Có \n" +
                        "2. Không");
                int chooseYesNo = Integer.parseInt(scanner.nextLine());
                if (chooseYesNo == 1) {
                    studentList.remove(student);
                    System.out.println("Xóa thành công!.");
                }
                isExit = true;
                break;
            }
        }
        if (!isExit) {
            System.out.println("Không tìm ra ID của sinh viên!  ");
        }
        WriteFileUtils.writeStudentFile(path, studentList);
    }

    @Override
    public void searchStudent() throws IOException {
        System.out.println("Bạn muốn tìm theo ID hay tên của học sinh: \n" +
                "1. Tìm theo ID\n" +
                "2. Tìm theo tên học sinh\n" +
                "3. Thoát");
        int choose = Integer.parseInt(scanner.nextLine());
        List<Student> studentList = ReadFileUtils.readStudentFile(path);

        do {
            switch (choose) {
                case 1:{
                    System.out.println("Nhập vào ID của học sinh:  ");
                    int idSearching = Integer.parseInt(scanner.nextLine());
                    boolean isExit = false;

                    for(Student student : studentList){
                        if(idSearching == student.getId()) {
                            System.out.println(student);

                        } isExit = true;
                        break;
                    }
                    if(!isExit){
                        System.out.println("Không tìm thấy ID của học sinh.");
                    }
                }
                case 2:{
                    System.out.println("Nhập vào tên sinh viên bạn cần tìm kiếm: ");
                    String nameSearching = scanner.nextLine();
                    boolean isExit = false;

                    for (Student student : studentList){
                        if(student.getName().toLowerCase().contains(nameSearching)){
                            System.out.println(student);


                            isExit = true;
                        }
                    }
                    if(!isExit){
                        System.out.println("Không tìm thấy sinh viên. ");
                    }

                }
                case 3:
                    return;
            }

        } while (true);
    }

    @Override
    public void sortByName() throws IOException {
        List<Student> studentList = ReadFileUtils.readStudentFile(path);
        boolean isSwap = true;
        for (int i = 0; i < studentList.size() && isSwap; i++){
            isSwap = false;
            for (int j = 0; j < studentList.size() - i - i; j++){
            if(studentList.get(j).getName().compareTo(studentList.get(j+1).getName()) > 0){
                Collections.swap(studentList,j,j+1);
                isSwap = true;
            }
            }
        }
        WriteFileUtils.writeStudentFile(path, studentList);
    }

    public static Student infoStudent() {
        int id;
        while (true){
            try {
                System.out.print("Nhập id: ");
                id = Integer.parseInt(scanner.nextLine());
                for(Student student : studentList){
                    if(student.getId() == id){
                        throw new DuplicateIDException("Trùng ID sinh viên!!!");
                    }
                }
                break;
            }catch (NumberFormatException e){
                System.out.println("Vui lòng nhập số!!!");
            }
            catch (DuplicateIDException e){
                System.out.println(e.getMessage());
            }
        }
        String name = Utils.getName();


        String dateOfBirth = Utils.getDateOfBirth();

        System.out.print("Nhập điểm: ");
        int point = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập tên trường: ");
        String nameSchool = scanner.nextLine();

        Student student = new Student(id, name, dateOfBirth, point, nameSchool);
        return student;
    }
}
