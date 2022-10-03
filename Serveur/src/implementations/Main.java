/*
 @author: Bourdeau Quentin
          Faucher Vinh

 */
package implementations;

import contrats.Distante;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Main {
    public static void main(String[] args) throws RemoteException {
        try {
            Distante d = new Connection(10001);
            Registry reg = LocateRegistry.createRegistry(2001);
            reg.rebind("MonOd",d);
        }
        catch (RemoteException e) {
            e.printStackTrace();
        }
    }


}
