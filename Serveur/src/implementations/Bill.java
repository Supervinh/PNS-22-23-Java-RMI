package implementations;

import contrats.IBill;

import java.io.Serializable;
import java.math.BigInteger;

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
