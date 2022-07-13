package ss9_dsa.practice.mvc.controller;

import ss9_dsa.practice.mvc.model.MyList;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInterger = new MyList<Integer>();
        listInterger.add(1);
        listInterger.add(2);
        listInterger.add(3);
        listInterger.add(4);

        System.out.println("element 3: "+listInterger.get(3));
        System.out.println("element 1: "+listInterger.get(1));
        System.out.println("element 2: "+listInterger.get(2));

        listInterger.get(-1);
        System.out.println("element -1: " + listInterger.get(-1));


    }
}
