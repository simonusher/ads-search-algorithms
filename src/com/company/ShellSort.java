package com.company;

/**
 * Created by Igor on 28.04.2017.
 */
public class ShellSort {
    int gaps[] = {301, 132, 57, 23, 10, 4, 1};
    public <T extends Comparable> void sort(T[] tab){
        for (int i = 0; i < gaps.length; i++) {
            for (int j = gaps[i]; j < tab.length; j++) {
                T temp = tab[j];
                int k ;
                for (k = j; k >= gaps[i] && tab[k - gaps[i]].compareTo(temp) > 0; k -= gaps[i])
                {
                    tab[k] = tab[k - gaps[i]];
                }
                tab[k] = temp;
            }

        }
    }
}
