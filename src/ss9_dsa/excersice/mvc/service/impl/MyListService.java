package ss9_dsa.excersice.mvc.service.impl;

import ss9_dsa.excersice.mvc.model.MyList;
import ss9_dsa.excersice.mvc.service.iMyListService;

import java.util.Arrays;

public  class MyListService   implements iMyListService {
    MyList myList = new MyList();

    @Override
    public void appends() {
        if (myList.getSize( ) == myList.getElements().length){

        }
    }

    @Override
    public void remove() {

    }

    @Override
    public int side() {
        myList.getSize();
    }

    @Override
    public void copy() {
        

    }

    @Override
    public void contain() {

    }

    @Override
    public void indexOf() {

    }

    @Override
    public int get() {
        return 0;
    }

    @Override
    public int get(Object object , int index) {

        return
    }

    @Override
    public void clear() {

    }

    @Override
    public void ensureCapacity() {

    }

    @Override
    public void addLast() {

    }

    @Override
    public void ensureCapa() {
        int newSize = myList.getElements().length * 2;
        myList.getElements()= Arrays.copyOf(myList.getElements() , newSize);
    }
}
