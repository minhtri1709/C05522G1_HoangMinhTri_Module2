package ss9_dsa.demo.src.service;

import ss9_dsa.demo.src.model.Student;

import java.io.IOException;

public interface IStudentService {
    void addStudent() throws IOException;

    void displayAllStudent();

    void removeStudent();

    void searchStudent();

    void sortByName();

}
