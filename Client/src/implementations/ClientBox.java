package implementations;


import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class ClientBox extends UnicastRemoteObject{

    String name;

    protected ClientBox(String clientName) throws RemoteException {
        name = clientName;
    }


}
