/*
 @author: Bourdeau Quentin
          Faucher Vinh

 */

package contrats;
/**
 * Exception lancée lorsque que l'utilisateur demande un ISBN n'existant pas dans la base de données
 */
public class InvalidISBNException extends Exception {

    public InvalidISBNException(){
        super("Invalid ISBN");
    }
}
