/*
 @author: Bourdeau Quentin
          Faucher Vinh

 */

package contrats;

/**
 * Exception lancée lorsque que l'utilisateur essaie d'enregistrer un compte avec un mail déjà utilisé
 */
public class SignUpFailed extends Exception {

    public SignUpFailed() {
        super("Account already exists");
    }


}
