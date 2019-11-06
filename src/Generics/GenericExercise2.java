package Generics;

import java.util.ArrayList;

public class GenericExercise2 {
    public static void main(String[] args) {
        //  Test Integer array
        System.out.println("------ Test Integer array ------");
        Integer[] arr = { 1, 2, 3, 4 };
        ArrayList<Integer> arrayList;

        arrayList = toArrayList(arr);
        printArrayList(arrayList);
        System.out.println();

        //  Test String array
        System.out.println("------ Test String array ------");
        String[] strArr = { "Hello", "world", "!!!"};
        ArrayList<String> stringArrayList;

        stringArrayList = toArrayList(strArr);
        printArrayList(stringArrayList);
    }

    static <T> ArrayList<T> toArrayList(T[] arr) {
        ArrayList<T> arrayList = new ArrayList<>();

        for (T e: arr) {
            arrayList.add(e);
        }

        return arrayList;
    }

    static <T> void printArrayList(ArrayList<T> arrayList) {
        for(T e: arrayList) {
            System.out.print(e + " ");
        }

        System.out.println();
    }
}
