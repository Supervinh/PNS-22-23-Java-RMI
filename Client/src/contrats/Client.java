package contrats;

import java.rmi.Remote;
import java.rmi.RemoteException;


public interface Client extends Remote {

    void facturer(Facture f) throws RemoteException;
    void register(String mail, String pwd);
    void login(String mail, String pwd);
    void viewCatalog();
}
