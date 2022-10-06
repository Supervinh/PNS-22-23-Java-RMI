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
    VODService vod;


    public Connection(int i) throws RemoteException{
        super(i);
        vod = new VODService(i);
    }

    @Override
    public boolean register(String mail, String pwd) throws RemoteException, SignUpFailed {
        User reg = new User(mail, pwd);
        if(userList.contains(reg)){
            throw new SignUpFailed();
        }
        else{
            userList.add(reg);
        }
        return true;
    }

    @Override
    public IVODService login(String mail, String pwd) throws RemoteException, InvalidCredentialException {
        User login = new User(mail, pwd);
        if(userList.contains(login)){
            return vod;
        }
        else{
            throw new InvalidCredentialException();
        }
    }
}
