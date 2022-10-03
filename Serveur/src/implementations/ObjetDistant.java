package implementations;

import contrats.Distante;
import contrats.Service;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ObjetDistant extends UnicastRemoteObject implements Distante {

    private Service service;

    public ObjetDistant(int i) throws RemoteException {
        service = new IntObjet();
    }

    @Override
    public void echo() throws RemoteException, InterruptedException {
        System.out.println("World");
    }

    @Override
    public Service getServiceAccess(){
        return service;
    }
}
