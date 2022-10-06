package contrats;

public class SignUpFailed extends Exception {

    public SignUpFailed(){
        super("Account already exists");
    }


}
