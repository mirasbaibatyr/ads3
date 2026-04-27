package org.example;

public class Experiment {
    private Sorter sorter = new Sorter();
    private Searcher searcher = new Searcher();

    public long measureBasicSort(int[] arr) {
        int[] copy = arr.clone();
        long startTime = System.nanoTime();
        sorter.basicSort(copy);
        return System.nanoTime() - startTime;
    }

    public long measureAdvancedSort(int[] arr) {
        int[] copy = arr.clone();
        long startTime = System.nanoTime();
        sorter.advancedSort(copy);
        return System.nanoTime() - startTime;
    }

    public long measureSearch(int[] arr, int target) {
        int[] copy = arr.clone();
        sorter.advancedSort(copy);

        long startTime = System.nanoTime();
        searcher.search(copy, target);
        return System.nanoTime() - startTime;
    }
}