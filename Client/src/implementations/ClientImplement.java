package implementations;

import contrats.Client;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ClientImplement extends UnicastRemoteObject implements Client {

    //List<Facture> fact;
    String name;

    protected ClientImplement(String clientName) throws RemoteException {
        //fact = new ArrayList<>();
        name = clientName;
    }

    /*@Override
    public void facturer(Facture f) throws RemoteException {
        fact.add(f);
    }*/

    /*@Override
    public String toString() {
        return "ClientImplement{" +
                "fact=" + fact +
                ", name='" + name + '\'' +
                '}';
    }*/
}
