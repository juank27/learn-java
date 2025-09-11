package platzi.play;
import platzi.play.contenido.Pelicula;
import platzi.play.Platform.User;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Pelicula pelicula = new Pelicula(); //instancia de un objeto
        pelicula.title = "Interstellar";
        pelicula.description = "A team of explorers travel through a wormhole in space in an attempt to ensure humanity's survival.";
        pelicula.duration = 169;
        pelicula.year = "2014";
        pelicula.isAvailable = true;
        pelicula.setRating(2.6);

        System.out.println(pelicula.getInfo());
        pelicula.play();
        System.out.println("Is the rating high? " + pelicula.isRatingHigh());

        pelicula.setRating(9.5);
        System.out.println("Is the rating high? " + pelicula.isRatingHigh());

        //new object user
        User user = new User();
        user.name = "John Doe";
        user.email = "test@test.com";

        user.view(pelicula);


        /*Scanner scanner = new Scanner(System.in); // revisar que esta ingresando por la consola
        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); //nextLine captura una linea de texto
        System.out.println("Hello, " + name + "!");

        System.out.println("Enter your age: ");
        int age = scanner.nextInt(); //nextInt captura un entero
        System.out.println("You are " + age + " years old.");*/


    }
}
