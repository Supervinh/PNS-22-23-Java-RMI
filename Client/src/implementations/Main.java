/*
 @author: Bourdeau Quentin
          Faucher Vinh

 */
package implementations;


import contrats.IConnection;
import contrats.InvalidCredentialException;
import contrats.SignUpFailed;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws RemoteException, NotBoundException, SignUpFailed, InvalidCredentialException {
        Registry reg = LocateRegistry.getRegistry("localhost", 2001);
        IConnection d = (IConnection) reg.lookup("MonOd");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 0 if you want to register, 1 if you want to log in : ");
        int number = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter your mail : ");
        String mail = scanner.nextLine();
        System.out.println("Enter your password : ");
        String pwd = scanner.nextLine();
        switch (number) {
            case 0:
                try {
                    d.register(mail, pwd);
                } catch (SignUpFailed signUpFailed) {
                    signUpFailed.printStackTrace();
                }
                break;
            case 1:
                try {
                    d.login(mail, pwd);
                } catch (InvalidCredentialException invalidCredentialException) {
                    invalidCredentialException.printStackTrace();
                }
        }
    }
}
