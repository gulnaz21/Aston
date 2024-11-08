package Homework_3;

import Homework_3.Collection.MyArrayList;

import java.util.ArrayList;

public class ArrayListRun {
    public static void main(String[] args) {

        MyArrayList<String> myArrayList = new MyArrayList<>(20);
        myArrayList.add("1");
        myArrayList.add("2");
        myArrayList.add("3");
        myArrayList.add("4");
        myArrayList.add("5");

        ArrayList<String> arrayList = new ArrayList<>(20);
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        arrayList.add("4");
        arrayList.add("5");

        System.out.println("myArrayList : " + myArrayList.get(3));
        System.out.println("arrayList   : " + arrayList.get(3));
        System.out.println();

        System.out.println("myArrayList : " + myArrayList.remove(4));
        System.out.println("arrayList   : " + arrayList.remove(4));
        System.out.println();

        System.out.println("myArrayList : " + myArrayList);
        System.out.println("arrayList   : " + arrayList);
    }
}
