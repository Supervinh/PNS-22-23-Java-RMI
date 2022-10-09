package implementations;


import contrats.IClientBox;

import java.nio.charset.StandardCharsets;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class ClientBox extends UnicastRemoteObject implements IClientBox {

    String name;

    protected ClientBox(String clientName) throws RemoteException {
        name = clientName;
    }

    public void stream(byte[] chunck){
        System.out.println(new String(chunck, StandardCharsets.UTF_8));
    }


}
