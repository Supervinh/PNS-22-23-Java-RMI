/*
 @author: Bourdeau Quentin
          Faucher Vinh

 */
package implementations;


import contrats.IClientBox;

import java.nio.charset.StandardCharsets;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Classe permettant de lire le film reçu par le serveur
 */
public class ClientBox extends UnicastRemoteObject implements IClientBox {

    String name;

    protected ClientBox(String clientName) throws RemoteException {
        name = clientName;
    }

    public void stream(byte[] chunck) throws RemoteException {
        System.out.println(new String(chunck, StandardCharsets.UTF_8));
    }


}
