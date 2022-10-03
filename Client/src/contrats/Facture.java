package contrats;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Facture implements Serializable {

    public int value;
    public Facture(int v){
        value = v;
    }


}
