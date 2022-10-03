package implementations;

import contrats.Client;
import contrats.Distante;
import contrats.Service;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Main {

    public static void main(String[] args) throws RemoteException, NotBoundException {
        Registry reg = LocateRegistry.getRegistry("localhost",2001);
        Distante d = (Distante)reg.lookup("MonOd");
        Client client = new ClientImplement("Titi");
        Service service = d.getServiceAccess();
        System.out.println(service.getValue(client));
        System.out.println(Thread.currentThread().getName());
        for (int i =1; i<9; i++){
            service.setValue(i,client);
        }
        //service.setValue(5, client); //ou le nom du thread à la place du args[0]
    }
}
