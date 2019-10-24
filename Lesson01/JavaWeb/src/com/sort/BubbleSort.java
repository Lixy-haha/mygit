package com.sort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {1,3,2,9,6,11,5};
        int temp=0;
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j <arr.length-i ; j++) {
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            System.out.println(Arrays.toString(arr));
        }
    }
}
