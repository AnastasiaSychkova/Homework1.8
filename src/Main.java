import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int[] arr = new int[3];
        arr [0] = 1;
        arr [1] = 2;
        arr [2] = 3;

        double[] arr2 = {1.57, 7.654, 9.986};

        int[] arr3 = {12, 15, 23, 25, 30};
    }

    public static void task2 () {
        System.out.println("Задача 2");
        int[] arr = new int[4];
        arr [0] = 1;
        arr [1] = 2;
        arr [2] = 3;
        arr [3] = 3;
        for (int i = 0 ; i < arr.length-1 ; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.print(arr[arr.length - 1]);

        System.out.println();

        double[] arr2 = {1.57, 7.654, 9.986};
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = {12, 15, 23, 25, 30};
        System.out.println(Arrays.toString(arr3));
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int[] arr = new int[3];
        arr [0] = 1;
        arr [1] = 2;
        arr [2] = 3;
        for (int i = arr.length-1  ; i > 0 ; i--) {
            System.out.print(arr[i] + ", ");
        }
        System.out.print(arr[0]);

        System.out.println();

        double[] arr2 = {1.57, 7.654, 9.986};
        for (int i = arr2.length-1  ; i > 0 ; i--) {
            System.out.print(arr2[i] + ", ");
        }
        System.out.print(arr2[0]);

        System.out.println();

        int[] arr3 = {12, 15, 23, 25, 30};
        for (int i = arr3.length-1  ; i > 0 ; i--) {
            System.out.print(arr3[i] + ", ");
        }
        System.out.print(arr3[0]);
        System.out.println();
    }
    public static void task4 () {
        System.out.println("Задача 4");
        int[] arr = new int[4];
        arr [0] = 1;
        arr [1] = 2;
        arr [2] = 3;
        arr [3] = 3;
        for (int i = 0 ; i < arr.length ; i++) {
            if (arr[i] % 2 != 0 ) {
                arr[i] += 1;
            }
            System.out.print(arr[i]);
            if (i != arr.length-1) {
                System.out.print(", ");
            }
        }
    }
}