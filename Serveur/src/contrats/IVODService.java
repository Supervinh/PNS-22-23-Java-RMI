package contrats;

import implementations.MovieDesc;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface IVODService extends Remote {
    List<MovieDesc> viewCatalog() throws RemoteException;
    IBill playmovie(String isbn, IConnection box) throws RemoteException;
}
