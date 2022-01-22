package course1.lesson3.homework3;

import static course1.lesson3.ArrayApp.printArray;

public class ArrayTasks {

    public static void main(String[] args) {


        int[] array = {1,1,0,1,0,0,1,0,1,1,0};
        printArray(array);

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            }
            else {
                array[i] = 1;
            }
        }
        printArray(array);
        System.out.println();

        int[] array2 = new int[100];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = i + 1;
        }
        printArray(array2);
        System.out.println();


        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Original array");
        printArray(array3);

        for (int i = 0; i < array3.length; i++) {
            if (array3[i] < 6) {
                array3[i] = array3[i]*2;
            }
        }
        System.out.println("Modified array");
        printArray(array3);
        System.out.println();

        int[][] array4 = new int[7][7];
        for (int i = 0; i < array4.length; i++) {
            for (int j = 0; j < array4[i].length; j++) {
                if (i == j) {
                    array4[i][j] = 1;
                }
                else if (j == array4.length - 1 - i) {
                    array4[i][j] = 1;
                }
                else {
                    array4[i][j] = 0;
                }
                System.out.print(array4[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        int l = 7;
        int inVal = 4;
        printArray(defineArray(l, inVal));
        System.out.println();

        valueMinMax(array3);


    }
    public static int[] defineArray(int len, int initialValue) {
        int[] newArray = new int[len];
        for (int i = 0; i < len; i++) {
            newArray[i] = initialValue;
        }
        return newArray;
    }
    public static int[] valueMinMax(int[] array) {
        int minValue = array[0];
        int maxValue = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
            else if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        int[] MinMax = {minValue, maxValue};
        printArray(array);
        System.out.println("max value = " + maxValue);
        System.out.println("min value = " + minValue);
        System.out.println();
        return MinMax;
    }
}