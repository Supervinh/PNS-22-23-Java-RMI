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
    private String movieName;
    private float price;

    public boolean pay() {
        return true; // Le paiement ne fait pas parti du projet
    }

    public Bill(float p, String name){
        price = p;
        movieName = name;
    }

    public float getPrice(){
        return price;
    }

    public String getMovieName() {
        return movieName;
    }
}
