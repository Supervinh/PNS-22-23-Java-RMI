/*
 @author: Bourdeau Quentin
          Faucher Vinh

 */
package contrats;

/**
 * Exception lancée lorsque que l'isbn du film n'existe pas dans la base de données
 */
public class FilmNotFoundException extends Exception {

    public FilmNotFoundException() {
        super("film's ISBN couldn't be found, try again.");
    }


}
