package com.company;

/**
 * Created by Igor on 28.04.2017.
 */
public class BinarySearch {
    private int tries;
    private int correctTries = 0;
    private int comparisonsCorrect = 0;
    private double avgCmpForCorrect;
    private int missedTries = 0;
    private int comparisonsMissed = 0;
    private double avgCmpForMissed;
    private double avgComparisons;

    public BinarySearch(int tries) {
        this.tries = tries;
    }

    public <T extends Comparable> void searchForNTimes(T[] array){
        Integer toFind;
        for (int i = 0; i < tries ; i++) {
            toFind = Generator.generate(2000);
            binSearch(toFind, array);
        }
        avgCmpForCorrect = comparisonsCorrect / correctTries;
        avgCmpForMissed = comparisonsMissed / missedTries;
        avgComparisons = (comparisonsCorrect + comparisonsMissed) / tries;

        System.out.println("Binary search:");
        System.out.println("Liczba prób: " + tries);
        System.out.println("Liczba wyszukiwań trafionych: " + correctTries +
                " Srednia liczba porównań: " + avgCmpForCorrect);
        System.out.println("Liczba wyszukiwań chybionych: " + missedTries +
                " Srednia liczba porównań: " + avgCmpForMissed);
        System.out.println("Srednia liczba porownan: " + avgComparisons);
    }

    public <T extends Comparable> void binSearch(T value, T arr[]) {
        int left = 0, right = arr.length - 1;
        int middle;
        int cmp = 0;
        while (left <= right) {
            middle = (left + right) / 2;
            cmp++;
            if (arr[middle].compareTo(value) == 0) {
                correctTries++;
                comparisonsCorrect += cmp;
                return;
            }
            else if (arr[middle].compareTo(value) > 0)
                right = middle - 1;
            else
                left = middle + 1;
        }
        missedTries++;
        comparisonsMissed += cmp;
    }

    private <T extends Comparable> Integer recursiveSearch(int left, int right, T obj, T[]array){
        if(left >= right){
            missedTries++;
            return -1;
        }
        int middle = (left + right)/2;
        if(array[middle].compareTo(obj) == 0){
            correctTries++;
            return (Integer)obj;
        }
        else if(array[middle].compareTo(obj) < 0){
            right = middle -1;
        }
        else left = middle + 1;
        return recursiveSearch(left, right, obj, array);
    }
}
