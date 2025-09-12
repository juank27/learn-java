package platzi.play.contenido;

import java.time.LocalDate;

public class Pelicula {

    //Attributes
    public String title;
    public String description;
    public int duration;
    public String year;
    public double rating;
    public boolean isAvailable;
    public LocalDate releaseDate;


    //Methods without parameters
    public void play() {
        System.out.println("Playing movie: " + title);
    }

    public String getInfo() {
        return "Title: " + title + "\nDescription: " + description + "\nDuration: " + duration + " minutes\nYear: " + year + "\nRating: " + rating + "\nAvailable: " + isAvailable + "\nRelease Date: " + releaseDate.getYear();
    }

    //with parameters
    public void setRating(double rating) {
        if ( rating >= 0 && rating <= 10 ) {
            this.rating = rating; //this.rating se refiere al atributo de la clase, rating es el parametro del metodo
        } else {
            System.out.println("Rating must be between 0 and 10");
        }
    }

    public boolean isRatingHigh() {
        return this.rating >= 7.5;
    }
}
