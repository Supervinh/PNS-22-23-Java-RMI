/*
 @author: Bourdeau Quentin
          Faucher Vinh

 */

package contrats;

import java.rmi.Remote;
import java.rmi.RemoteException;
/**
 * Interface afin de créer la connection entre le client et le serveur
 */
public interface IConnection extends Remote {

    boolean register(String mail, String pwd) throws RemoteException,SignUpFailed;
    IVODService login(String mail, String pwd) throws RemoteException,InvalidCredentialException;

}
