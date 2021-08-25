package br.com.fatec.sort.utils;

public class Utils {
    public static void printArray(int arr[]){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ ",");
        }
        System.out.println("]");
    }
}
