package ss9_dsa.demo.src.service;

import java.io.IOException;

public interface ITeacherService {
    void add() throws IOException;

    void remove() throws IOException;

    void display() throws IOException;

    void search() throws IOException;

    void sortByName() throws IOException;
}
