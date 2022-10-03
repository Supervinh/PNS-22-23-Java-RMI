package contrats;

public class SignUpFailed extends Throwable {

    SignUpFailed() throws Throwable {
        throw new Throwable("E-mail already used");
    }


}
