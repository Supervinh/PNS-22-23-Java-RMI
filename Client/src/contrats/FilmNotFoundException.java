package contrats;

public class FilmNotFoundException extends Exception {

    public FilmNotFoundException(){
        super("film's ISBN couldn't be found");
    }


}
