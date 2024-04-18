package org.example.utils;

import java.util.ArrayList;

// класс контейнер, не имеет отношение к шифрованию
public class ArrayListContainer {
    private ArrayList<Integer> list1;
    private ArrayList<Integer> list2;

    public ArrayListContainer(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        this.list1 = list1;
        this.list2 = list2;
    }

    public ArrayList<Integer> getList1() {
        return list1;
    }

    public ArrayList<Integer> getList2() {
        return list2;
    }
}
