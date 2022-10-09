/*
 @author: Bourdeau Quentin
          Faucher Vinh

 */
package implementations;

import contrats.IConnection;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * Classe permettant de lancer le serveur
 */
public class Main {
    public static void main(String[] args) {
        try {
            IConnection d = new Connection(2001);
            Registry reg = LocateRegistry.createRegistry(2001);
            reg.rebind("MonOd", d);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }


}
