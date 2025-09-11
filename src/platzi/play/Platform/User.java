package platzi.play.Platform;

import platzi.play.contenido.Pelicula;

public class User {
    public String name;
    public String email;
    public String password;
    public boolean isActive;
    public String role; // admin, user, guest

    public void view(Pelicula pelicula){
        System.out.println(name + " is viewing ");
        pelicula.play();
    }
}
