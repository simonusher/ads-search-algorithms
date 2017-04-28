package com.company;

import java.util.Random;

/**
 * Created by Igor on 10.04.2017.
 */
public class Generator {
    public static Random generator = new Random();

    public static Integer[] generate(int size, int range){
        Integer tab[] = new Integer[size];
        for (int i = 0; i < size; i++) {
            tab[i] = generator.nextInt(range + 1);
        }
        return tab;
    }



    public static Integer generate(int range){
        return generator.nextInt(range + 1);
    }
}
