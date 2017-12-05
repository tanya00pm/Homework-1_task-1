package ru.levelup.tatiana_nesterova.qa.homework1.task1;

public class BubbleSort {

    public BubbleSort() {
        // constructor
    }

    private double[] runBubbleIteration(double arr[]) {
        // single iteration method

        double temp;

        for (int i = arr.length-1; i >= 0; i--)
        {
            if(i > 0 && arr[i] < arr[i-1])
            {
                temp = arr[i];
                arr[i] = arr[i-1];
                arr[i-1]= temp;
            }
        }
        return arr;
    }

    public double[] runSorting(double arr[]) {
        // array sorting method

        for (int j=0; j<arr.length-1-1; j++)
        {
            this.runBubbleIteration(arr);
        }
        return arr;
    }

}
