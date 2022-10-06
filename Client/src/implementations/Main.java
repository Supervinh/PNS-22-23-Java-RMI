/*
 @author: Bourdeau Quentin
          Faucher Vinh

 */
package implementations;


import contrats.IConnection;
import contrats.IVODService;
import contrats.InvalidCredentialException;
import contrats.SignUpFailed;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.List;
import java.util.Scanner;

import static java.lang.Thread.sleep;

public class Main {

    public static void main(String[] args) throws RemoteException, NotBoundException, InterruptedException {
        Registry reg = LocateRegistry.getRegistry("localhost", 2001);
        IConnection d = (IConnection) reg.lookup("MonOd");
        IVODService vod = null;
        Scanner scanner = new Scanner(System.in);
        while (vod == null) {
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
                        System.out.println("You have been registered\n");
                    } catch (SignUpFailed signUpFailed) {
                        signUpFailed.printStackTrace();
                    }
                    break;
                case 1:
                    try {
                        vod = d.login(mail, pwd);
                        System.out.println("You have been logged in\n");
                    } catch (InvalidCredentialException invalidCredentialException) {
                        invalidCredentialException.printStackTrace();
                    }
                    break;
            }
        }
        sleep(1500);
        System.out.println("Welcome to the VOD service which contains the following movies :\n");
        sleep(1500);
        List<MovieDesc> list = vod.viewCatalog();
        for (MovieDesc m : list) {
            System.out.println(m);
        }

        sleep(2500);
        String isbn ="";
        while (true) {
            System.out.println("\nEnter the ISBN of the movie you want to watch : ");
            isbn = scanner.nextLine();
            System.out.println(isbn);
            vod.playmovie(isbn, d);
        }


    }
}
