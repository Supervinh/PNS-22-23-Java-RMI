package implementations;

import contrats.IConnection;
import contrats.IVODService;
import contrats.InvalidCredentialException;
import contrats.SignUpFailed;

import java.lang.reflect.Array;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class Connection extends UnicastRemoteObject implements Remote, IConnection {

    List<User> userList;
    VODService vod;


    public Connection(int i) throws RemoteException{
        super(i);
        vod = new VODService(i);
        userList = new ArrayList<>();
    }

    @Override
    public boolean register(String mail, String pwd) throws RemoteException, SignUpFailed {
        for(User u : userList){
            if(u.mail.equals(mail)){
                throw new SignUpFailed();
            }
        }
            userList.add(new User(mail, pwd));

        for(User u : userList){
            System.out.print(u.mail);
        }
        System.out.println();
        return true;
    }

    @Override
    public IVODService login(String mail, String pwd) throws RemoteException, InvalidCredentialException {
        User log = new User(mail, pwd);
        for(User u : userList){
            if(u.equals(log)){
                return vod;
            }
        }
            throw new InvalidCredentialException();
    }
}
