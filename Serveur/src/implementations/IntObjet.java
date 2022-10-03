package implementations;

import contrats.Client;
import contrats.Service;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class IntObjet extends UnicastRemoteObject implements Service, Client {

    private int value;
    IntObjet() throws RemoteException {
        value = 1;
    }

    IntObjet(int valeur) throws RemoteException{
        value = valeur;
    }

    @Override
    public int getValue(Client cname) throws RemoteException{
        return value;
    }

    @Override
    public synchronized int setValue(int v, Client cname) throws RemoteException{
        value=value*v;
        System.out.println("Thread:"+Thread.currentThread().getName()+" val renvoyée : " + value + "au Client "+cname);
        //Bill f= new Bill(v) ; // prix à payer pour cette opération
        /*try {
            cname.facturer(f); // délivre la facture à cname !
        } catch (java.rmi.RemoteException e) {}*/
        return value;

    }


    /*@Override
    public void facturer(Bill f) throws RemoteException {
        System.out.println(f);
    }*/
}
