package contrats;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IConnection extends Remote {

    boolean register(String mail, String pwd) throws RemoteException,SignUpFailed;
    IVODService login(String mail, String pwd) throws RemoteException,InvalidCredentialException;

    //void facturer(Bill f) throws RemoteException;
}
