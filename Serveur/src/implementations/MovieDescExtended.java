package implementations;

/**
 * Classe qui extiend MovieDesc et qui ajoute un attribut "trailer" qui se lance automatiquement
 */
public class MovieDescExtended extends MovieDesc{
    public MovieDescExtended(String movieName, String isbn, String synopsis, Bill bill) {
        super(movieName, isbn, synopsis, bill);
    }
}
