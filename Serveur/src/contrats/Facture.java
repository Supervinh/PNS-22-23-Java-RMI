package contrats;

import java.io.Serializable;

public class Facture implements Serializable {

    int value;

    public Facture(int v){
        value = v;
    }
}
