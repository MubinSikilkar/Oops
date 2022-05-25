package com.company;
import java.util.Scanner;
public class Cwh_29_Array_Practise_Again {
    public static void main(String[] args) {
        boolean isSorted = true;
        int arr[] = {1, 2, 4, 5, 3};
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }
        if (isSorted) {
            System.out.println("The array is Sorted");
        } else {
            System.out.println("the Array is not Sorted");
        }


    }

}
