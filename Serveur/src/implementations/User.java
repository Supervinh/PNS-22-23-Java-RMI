/*
 @author: Bourdeau Quentin
          Faucher Vinh

 */
package implementations;

import java.io.Serializable;

/**
 * Classe représentant un utilisateur possédant un mail et un mot de passe
 */
public class User implements Serializable {
    String mail;
    String pwd;

    User(String mail, String pwd){
        this.mail = mail;
        this.pwd = pwd;
    }

    boolean equals(User u2){
        return (this.mail.equals(u2.mail) && this.pwd.equals(u2.pwd));
    }
}
