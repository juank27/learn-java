package platzi.play;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner scanner = new Scanner(System.in); // revisar que esta ingresando por la consola
        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); //nextLine captura una linea de texto
        System.out.println("Hello, " + name + "!");

        System.out.println("Enter your age: ");
        int age = scanner.nextInt(); //nextInt captura un entero
        System.out.println("You are " + age + " years old.");
    }
}
