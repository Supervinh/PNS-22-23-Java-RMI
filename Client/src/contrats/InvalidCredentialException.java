package contrats;

public class InvalidCredentialException extends Exception {

    public InvalidCredentialException(){
        super("Account doesn't exist, please proceed through registration first");
    }

}
