/*
 @author: Bourdeau Quentin
          Faucher Vinh

 */

package contrats;

/**
 * Exception lancée lorsque que l'utilisateur essaie de se connecter avec de mauvais identifiants
 */
public class InvalidCredentialException extends Exception {

    public InvalidCredentialException() {
        super("Account doesn't exist, please proceed through registration first");
    }

}
