package implementations;

import java.io.Serializable;

public class Bill implements Serializable {
    private String movieName;
    private float price;

    public boolean pay() {
        return true; // payment isn't a part of this project
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
