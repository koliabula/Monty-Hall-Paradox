package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class MontyHallParadox {
    public static final int CAR = 1;
    public static final int GOAT = 0;
    public static ArrayList testData(){
        ArrayList<Integer> list = new ArrayList<>(3);
        list.add(GOAT);
        list.add(GOAT);
        list.add(new Random().nextInt(0, 3), CAR);
        return list;
    }

    public static Boolean openDoor(ArrayList<Integer> list, boolean change) {

        int index = new Random().nextInt(0, 3);
        if (list.get(index) == CAR) {
            if(change) {return false;}
            return true;
        } else {
            if (change) {
                return true;
            }
            return false;
        }
    }

    public static void statistic(HashMap<Integer, Boolean> map){
        int win = 0;
        int lose = 0;
        for (int i = 0; i < 1000; i++) {
            if(map.get(i)){
                win++;
            } else {
                lose++;
            }
        }
        System.out.println("Win: " + win);
        System.out.println("Lose: " + lose);
    }
}
