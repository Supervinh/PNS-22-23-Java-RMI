package contrats;

public class InvalidCredentialException extends Throwable {

    InvalidCredentialException() throws Throwable {
        throw new Throwable("Credentials are invalid");
    }

}
