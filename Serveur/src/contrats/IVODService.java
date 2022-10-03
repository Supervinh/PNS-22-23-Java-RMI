package contrats;

import implementations.Bill;
import implementations.MovieDesc;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface IVODService extends Remote {
    List<MovieDesc> viewCatalog() throws RemoteException;
    Bill playmovie(String isbn, IConnection box) throws RemoteException;
}
