package platzi.play.utils;

import java.util.Scanner;

public class ScannerUtils {

    public static Scanner SCANNER = new Scanner(System.in);

    public static String captureText(String message) {
        System.out.println(message + ": ");
        return SCANNER.nextLine();
    }

    public int captureInt(String message) {
        System.out.println(message + ": ");

        int data  = SCANNER.nextInt();
        SCANNER.nextLine(); //limpiar el buffer
        return data;
    }

    public double captureDouble(String message) {
        System.out.println(message + ": ");

        double data  = SCANNER.nextDouble();
        SCANNER.nextLine(); //limpiar el buffer
        return data;
    }
}
