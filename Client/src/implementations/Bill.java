/*
 @author: Bourdeau Quentin
          Faucher Vinh

 */
package implementations;

import java.io.Serializable;

/**
 * Facture contenant un prix et un nom de film
 */
public class Bill implements Serializable {
    private final String movieName;
    private final float price;

    public Bill(float p, String name) {
        price = p;
        movieName = name;
    }

    public boolean pay() {
        return true; // Le paiement ne fait pas parti du projet
    }

    public float getPrice() {
        return price;
    }

    public String getMovieName() {
        return movieName;
    }

    @Override
    public String toString() {
        return "La facture du film " + movieName +
                " est de " + price +
                '€';
    }
}
