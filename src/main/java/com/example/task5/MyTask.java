package com.example.task5;

public class MyTask {
    public static void main(String[] args) {
        int[] arr = {4, 2, 8, 4, 5, 8, 3, 1, 2};
        System.out.println("Duplicated elements in given array are: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    System.out.println(arr[j]);
            }
        }
    }
}