package implementations;

import java.io.Serializable;

public class MovieDesc implements Serializable {
    private String movieName;
    private String isbn;
    private String synopsis;
    private Bill bill;

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
