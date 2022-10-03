package implementations;

import contrats.IConnection;
import contrats.IVODService;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class VODService extends UnicastRemoteObject implements IVODService {

    protected VODService(int port) throws RemoteException {
        super(port);
    }

    @Override
    public List<MovieDesc> viewCatalog() throws RemoteException {
        return null;
    }

    @Override
    public Bill playmovie(String isbn, IConnection box) throws RemoteException{
        return null;
    }
}
