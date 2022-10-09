/*
 @author: Bourdeau Quentin
          Faucher Vinh

 */
package contrats;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Interface permettant au client de lire le film reçu par le serveur
 */
public interface IClientBox extends Remote {
    void stream(byte[] chunck) throws RemoteException;
}
