/*
 @author: Bourdeau Quentin
          Faucher Vinh

 */
package implementations;


import contrats.IConnection;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Main {

    public static void main(String[] args) throws RemoteException, NotBoundException {
        Registry reg = LocateRegistry.getRegistry("localhost",2001);
        IConnection d = (IConnection) reg.lookup("MonOd");
    }
}
