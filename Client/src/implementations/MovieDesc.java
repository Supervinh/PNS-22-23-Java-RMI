/*
 @author: Bourdeau Quentin
          Faucher Vinh

 */
package implementations;

import java.io.Serializable;

/**
 * Classe contenant la description du film, c'est à dire le nom du film, son isbn, son synopsis et sa facture
 */
public class MovieDesc implements Serializable {
    private final String movieName;
    private final String isbn;
    private final String synopsis;
    private final Bill bill;

    public MovieDesc(String movieName, String isbn, String synopsis, Bill bill) {
        this.movieName = movieName;
        this.isbn = isbn;
        this.synopsis = synopsis;
        this.bill = bill;
    }

    public String getMovieName() {
        return movieName;
    }

    public Bill getBill() {
        return bill;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return "movieName='" + movieName + '\'' +
                ", isbn='" + isbn + '\'' +
                ", synopsis='" + synopsis + '\'' +
                ", bill=" + bill.getPrice();
    }
}
