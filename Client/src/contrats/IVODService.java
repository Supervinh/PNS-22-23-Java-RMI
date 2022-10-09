/*
 @author: Bourdeau Quentin
          Faucher Vinh

 */

package contrats;

import implementations.Bill;
import implementations.MovieDesc;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 * Interface permettant de choisir et de lancer le film voulu
 */

public interface IVODService extends Remote {
    List<MovieDesc> viewCatalog() throws RemoteException;
    Bill playmovie(String isbn, IConnection box) throws RemoteException;
}
