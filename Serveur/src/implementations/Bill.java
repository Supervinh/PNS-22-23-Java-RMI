package implementations;

import java.io.Serializable;

public class Bill implements Serializable, IBill {
    String movieName;
    float price;

    @Override
    public boolean pay() {
        return true; // payment isn't a part of this project
    }

    public Bill(float p, String name){
        price = p;
        movieName = name;
    }
}
