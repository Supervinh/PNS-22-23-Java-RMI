package contrats;

import java.rmi.Remote;
import java.rmi.RemoteException;


public interface Client extends Remote {

    void facturer(Facture f) throws RemoteException;
}
