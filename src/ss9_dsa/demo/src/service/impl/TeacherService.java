package ss9_dsa.demo.src.service.impl;

import ss9_dsa.demo.src.exception.DuplicateIDException;
import ss9_dsa.demo.src.model.Student;
import ss9_dsa.demo.src.model.Teacher;
import ss9_dsa.demo.src.service.ITeacherService;
import ss9_dsa.demo.src.utils.ReadFileUtils;
import ss9_dsa.demo.src.utils.WriteFileUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TeacherService implements ITeacherService {
    private static List<Teacher> teacherList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    private static String path = "ss9_dsa/demo/src/utils/FileTeacher";


    @Override
    public void add() throws IOException {
        List<Teacher> teacherList = ReadFileUtils.readTeacherFile(path);
        Teacher teacher = infoTeacher();
        teacherList.add(teacher);
        WriteFileUtils.writeTeacherFile(path , teacherList);
        System.out.println("Thêm mới giảng viên thành công! ");
    }


    @Override
    public void display() throws IOException {
        List<Teacher> teacherList = ReadFileUtils.readTeacherFile(path);
        for (Teacher teacher : teacherList) {
            System.out.println(teacher);
        }
    }

    @Override
    public void remove() throws IOException {
        System.out.println("Mời bạn nhập id của giảng viên cần xóa: ");
        int idRemove = Integer.parseInt(scanner.nextLine());
        boolean isExit = false;
        List<Teacher> teacherList = ReadFileUtils.readTeacherFile(path);

        for (Teacher teacher : teacherList) {
            if (teacher.getId() == idRemove) {
                System.out.println(" Bạn có chắc muốn xóa hay không? \n" +
                        "1. Có \n" +
                        "2. Không");
                int chooseYesNo = Integer.parseInt(scanner.nextLine());
                if (chooseYesNo == 1) {
                    teacherList.remove(teacher);
                    System.out.println("Xóa thành công!.");
                }
                isExit = true;
                break;
            }
            WriteFileUtils.writeTeacherFile(path , teacherList);
        }
        if (!isExit) {
            System.out.println("Không tìm ra ID của giảng viên!  ");
        }
    }

    @Override
    public void search() throws IOException {
        System.out.println("Bạn muốn tìm theo ID hay tên của giảng viên: \n" +
                "1. Tìm theo ID\n" +
                "2. Tìm theo tên giảng viên\n" +
                "3. Thoát");
        int choose = Integer.parseInt(scanner.nextLine());
        List<Teacher> teacherList = ReadFileUtils.readTeacherFile(path);

        do {
            switch (choose) {
                case 1: {
                    System.out.println("Nhập vào ID của giảng viên:  ");
                    int idSearching = Integer.parseInt(scanner.nextLine());
                    boolean isExit = false;

                    for (Teacher teacher : teacherList) {
                        if (idSearching == teacher.getId()) {
                            System.out.println(teacher);

                        }
                        isExit = true;
                        break;
                    }
                    if (!isExit) {
                        System.out.println("Không tìm thấy ID của giảng viên.");
                    }
                }
                case 2: {
                    System.out.println("Nhập vào tên giảng viên bạn cần tìm kiếm: ");
                    String nameSearching = scanner.nextLine();
                    boolean isExit = false;

                    for (Teacher teacher : teacherList) {
                        if (teacher.getName().toLowerCase().contains(nameSearching)) {
                            System.out.println(teacher);


                            isExit = true;
                        }
                    }
                    if (!isExit) {
                        System.out.println("Không tìm thấy giảng viên. ");
                    }

                }
                case 3:
                    return;
            }

        } while (true);
    }

    @Override
    public void sortByName() throws IOException {
        List<Teacher> teacherList = ReadFileUtils.readTeacherFile(path);
        boolean isSwap = true;

        for (int i = 0; i < teacherList.size() && isSwap; i++) {
            isSwap = false;
            for (int j = 0; j < teacherList.size() - 1 - i; j++) {
                if (teacherList.get(j).getName().compareTo(teacherList.get(j + 1).getName()) > 0) {
                    Collections.swap(teacherList, j, j + 1);
                    isSwap = true;
                }
            }
        }
        WriteFileUtils.writeTeacherFile(path , teacherList);
    }

    public static Teacher infoTeacher() {
        int id;
        while (true) {
            try {
                System.out.print("Nhập id: ");
                id = Integer.parseInt(scanner.nextLine());
                for (Teacher teacher : teacherList) {
                    if (teacher.getId() == id) {
                        throw new DuplicateIDException("Trùng ID giảng viên!!!");
                    }
                }
                break;
            } catch (DuplicateIDException e) {
                System.out.println(e.getMessage());
            } catch (NumberFormatException e){
                System.out.println("Vui lòng nhập số!!!");
            }
        }

        System.out.print("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập ngày sinh: ");
        String dateOfBirth = scanner.nextLine();
        System.out.print("Nhập chuyên môn: ");
        String specialize = scanner.nextLine();
        Teacher teacher = new Teacher(id, name, dateOfBirth, specialize);
        return teacher;
    }
}
