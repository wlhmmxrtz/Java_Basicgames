package at.mow.test.sort;
import java.util.Scanner;
import java.util.Random;

public class DataGenerator {

    public static void main(String[] args) {
        System.out.println("Wie lange soll ihr DataArray sein?");
        Scanner sizeScan = new Scanner(System.in);
        int size = sizeScan.nextInt();

        System.out.println("Wollen sie den Zahlenbereich einschrenken?");
        System.out.println("1 [JA] - - - - 2 [NEIN]");
        Scanner selectScan = new Scanner(System.in);
        int selection = selectScan.nextInt();

        if (selection == 2) {
            int[] dataArray1 = generateDataArray(size);

            System.out.println("Generated Data Array 1:");
            printArray(dataArray1);

        } else {

            System.out.println("geben sie den min wert ein:");
            Scanner minScan = new Scanner(System.in);
            int min = minScan.nextInt();
            System.out.println("max wert:");
            Scanner maxScan = new Scanner(System.in);
            int max = maxScan.nextInt();

            int[] dataArray2 = generateDataArray(size, min, max);

            System.out.println("Generated Data Array 2:");
            printArray(dataArray2);
        }
    }

    public static int[] generateDataArray(int size) {
        int[] dataArray = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            dataArray[i] = random.nextInt();
        }

        return dataArray;
    }

    public static int[] generateDataArray(int size, int min, int max) {

        int[] dataArray = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            dataArray[i] = random.nextInt((max - min) + 1) + min;
        }

        return dataArray;
    }

    public static void printArray(int[] data) {
        for (int value : data) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
