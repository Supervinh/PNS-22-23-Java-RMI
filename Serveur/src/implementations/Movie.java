package implementations;

import java.io.Serializable;

public class Movie implements Serializable {
    byte[] content;
    String isbn;

    public Movie(String isbn, byte[] bytes) {
        this.isbn = isbn;
        this.content = bytes;
    }
}
