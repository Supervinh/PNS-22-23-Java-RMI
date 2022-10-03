package contrats;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Distante extends Remote{

    void echo() throws RemoteException, InterruptedException;


    Service getServiceAccess() throws RemoteException;

}
