/*
 @author: Bourdeau Quentin
          Faucher Vinh

 */
package implementations;

import java.io.Serializable;

/**
 * Facture contenant le "film" et son isbn associé
 */
public class Movie implements Serializable {
    private byte[] content;
    private String isbn;

    public Movie(String isbn, byte[] bytes) {
        this.isbn = isbn;
        this.content = bytes;
    }

    public byte[] getContent() {
        return content;
    }

    public String getIsbn() {
        return isbn;
    }
}
