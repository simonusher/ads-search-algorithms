package com.company;

/**
 * Created by Igor on 28.04.2017.
 */
public class LinearSearch {
    private int tries;
    private int correctTries = 0;
    private int comparisonsCorrect = 0;
    private double avgCmpForCorrect;
    private int missedTries = 0;
    private int comparisonsMissed = 0;
    private double avgCmpForMissed;
    private double avgComparisons;

    public LinearSearch(int tries) {
        this.tries = tries;
    }

    public <T> void searchForNTimes(T[] tab){
        Integer toFind;
        for (int i = 0; i < tries; i++) {
            toFind = Generator.generate(2000);
            search(toFind, tab);
        }
        avgCmpForCorrect = comparisonsCorrect / correctTries;
        avgCmpForMissed = comparisonsMissed / missedTries;
        avgComparisons = (comparisonsCorrect + comparisonsMissed) / tries;

        System.out.println("Linear search:");
        System.out.println("Liczba prób: " + tries);
        System.out.println("Liczba wyszukiwań trafionych: " + correctTries +
                " Srednia liczba porównań: " + avgCmpForCorrect);
        System.out.println("Liczba wyszukiwań chybionych: " + missedTries +
                " Srednia liczba porównań: " + avgCmpForMissed);
        System.out.println("Srednia liczba porownan: " + avgComparisons);
        System.out.println();
    }

    public <T> void search(T obj, T[]array){
        int cmp = 0;
        for (int i = 0; i < array.length; i++) {
            cmp++;
            if(array[i].equals(obj)){
                correctTries++;
                comparisonsCorrect += cmp;
                return;
            }
        }
        missedTries ++;
        comparisonsMissed += cmp;
    }

}
