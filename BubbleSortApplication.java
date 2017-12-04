package ru.levelup.tatiana_nesterova.qa.homework1.task1;

public class BubbleSortApplication {
    // Tatiana Nesterova, homework #1, task #1

    public static void main(String[] args) {

        BubbleSortApplication app = new BubbleSortApplication();
        app.startApplication();
    }

    public void PrintArray(double arr[]) {
        // print array on console method

        for (int i=0; i< arr.length; i++)
        {
            System.out.println(Double.toString(arr[i]));
        }
    }

    public void startApplication() {

        BubbleSort cl= new BubbleSort();

        // initial array
        double mas[] = {16, 78, 6, 82, 67, 55, 9, 4, 88};

        System.out.println("Initial array:");
        this.PrintArray(mas);

        System.out.println("\nResult array:");

        // bubble sorting
        cl.Sorting(mas);

        // result array
        this.PrintArray(mas);

    }
}
