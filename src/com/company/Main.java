package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Integer tab[] = Generator.generate(1000, 2000);
//        System.out.println(tab.length);
        LinearSearch l = new LinearSearch(1000);
        l.searchForNTimes(tab);
        ShellSort s = new ShellSort();
        s.sort(tab);
//        System.out.println(Arrays.toString(tab));
        BinarySearch b = new BinarySearch(1000);
        b.searchForNTimes(tab);
    }
}
