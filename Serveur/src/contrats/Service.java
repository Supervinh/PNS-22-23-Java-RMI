package contrats;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Service extends Remote {

    int value = 0;

    int getValue(Client cname) throws RemoteException;

    int setValue(int v, Client cname) throws RemoteException;

}
