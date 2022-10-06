package contrats;

public class InvalidISBNException extends Exception {

    public InvalidISBNException(){
        super("Invalid ISBN");
    }
}
