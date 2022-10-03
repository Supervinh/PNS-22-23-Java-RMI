package implementations;

import contrats.IConnection;
import contrats.IVODService;
import contrats.InvalidCredentialException;
import contrats.SignUpFailed;

import java.lang.reflect.Array;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class Connection extends UnicastRemoteObject implements Remote, IConnection {

    List<User> userList;


    public Connection(int i) throws RemoteException{
        super(i);
    }

    @Override
    public boolean register(String mail, String pwd) throws RemoteException, SignUpFailed {
        return false;
    }

    @Override
    public IVODService login(String mail, String pwd) throws RemoteException, InvalidCredentialException {
        return null;
    }
}
