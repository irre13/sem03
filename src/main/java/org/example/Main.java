package org.example;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(6);
        list.add(3);
        list.add(1);
        list.removeIf(num -> num % 2 == 0);
        System.out.println(list);
    }

}

