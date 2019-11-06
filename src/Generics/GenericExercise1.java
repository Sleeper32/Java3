package Generics;

public class GenericExercise1 {
    public static void main(String[] args) {
        //  Change elements in Integer array
        Integer[] arr = new Integer[]{ 1, 2 };

        System.out.println("------ Test Integer array ------");
        printArr(arr);
        Changer.change(arr);
        printArr(arr);
        System.out.println();

        // Change elements in String array
        String[] arr2 = new String[]{ "Hello", "world" };

        System.out.println("------ Test String array ------`");
        printArr(arr2);
        Changer.change(arr2);
        printArr(arr2);

    }

    public static <T> void printArr(T[] arr) {
        for (T a: arr) {
            System.out.print(a + " ");
        }
        System.out.println();
    }
}

class Changer {
    static <T> void change(T[] arr) {
        T temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }
}
