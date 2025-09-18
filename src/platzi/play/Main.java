package platzi.play;
import platzi.play.contenido.Pelicula;
import platzi.play.Platform.User;
import platzi.play.utils.ScannerUtils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {

    public static final String VERSION = "1.0.0"; //constante


    public static void main(String[] args) {
        System.out.println("Hello world! " + VERSION);

        //static method
        String name = ScannerUtils.captureText("Enter your name" ); //funcion estatica
        System.out.println("Hello, " + name + "!");

        //instance method
        ScannerUtils scannerUtils = new ScannerUtils();
        int age = scannerUtils.captureInt("Enter your age");
        System.out.println("You are " + age + " years old.");

        double height = scannerUtils.captureDouble("Enter your height in meters");
        System.out.println("You are " + height + " meters tall.");



        Pelicula pelicula = new Pelicula(); //instancia de un objeto
        pelicula.title = "Interstellar";
        pelicula.description = "A team of explorers travel through a wormhole in space in an attempt to ensure humanity's survival.";
        pelicula.duration = 169;
        pelicula.year = "2014";
        pelicula.isAvailable = true;
        pelicula.setRating(2.6);
        pelicula.releaseDate = LocalDate.of(2014, 11, 7);

        System.out.println(pelicula.getInfo());
        pelicula.play();
        System.out.println("Is the rating high? " + pelicula.isRatingHigh());

        pelicula.setRating(9.5);
        System.out.println("Is the rating high? " + pelicula.isRatingHigh());

        //new object user
        User user = new User();
        user.name = "John Doe";
        user.email = "test@test.com";
        user.registrationDate = LocalDateTime.of( 2020, 5, 20, 15, 30, 45);

        user.view(pelicula);
        System.out.println(user.registrationDate);

        /*Scanner scanner = new Scanner(System.in); // revisar que esta ingresando por la consola
        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); //nextLine captura una linea de texto
        System.out.println("Hello, " + name + "!");

        System.out.println("Enter your age: ");
        int age = scanner.nextInt(); //nextInt captura un entero
        System.out.println("You are " + age + " years old.");*/

        //casting implicito
        long durationLong = pelicula.duration; //int a long

        //casting explicito
        int ratingInt = (int) pelicula.rating; //double a int

        long numeroDePremios = Long.parseLong("123456789"); //String a long


    }
}
