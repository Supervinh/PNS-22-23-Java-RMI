package implementations;

import java.io.Serializable;

public class MovieDesc implements Serializable {
    String movieName;
    String isbn;
    String synopsis;
    Bill bill;

    public MovieDesc(String movieName, String isbn, String synopsis, Bill bill) {
        this.movieName = movieName;
        this.isbn = isbn;
        this.synopsis = synopsis;
        this.bill = bill;
    }
}
