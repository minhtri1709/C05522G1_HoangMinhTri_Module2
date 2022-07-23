package ss9_dsa.demo.src.service;

import java.io.IOException;

public interface ITeacherService {
    void add() throws IOException;

    void remove();

    void display();

    void search();

    void sortByName();
}
