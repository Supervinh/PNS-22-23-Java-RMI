/*
 @author: Bourdeau Quentin
          Faucher Vinh

 */
package implementations;


import java.nio.charset.StandardCharsets;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class ClientBox extends UnicastRemoteObject{

    String name;

    protected ClientBox(String clientName) throws RemoteException {
        name = clientName;
    }

    void stream(byte[]  chunck){
        System.out.println(new String(chunck, StandardCharsets.UTF_8));
    }


}
