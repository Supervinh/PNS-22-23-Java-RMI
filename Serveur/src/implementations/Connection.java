/*
 @author: Bourdeau Quentin
          Faucher Vinh

 */
package implementations;

import contrats.IConnection;
import contrats.IVODService;
import contrats.InvalidCredentialException;
import contrats.SignUpFailed;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import java.io.*;
import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.KeySpec;
import java.util.ArrayList;
import java.util.List;

/**
 * CLasse implementant l'interface IConnection
 */
public class Connection extends UnicastRemoteObject implements Remote, IConnection {

    VODService vod;


    public Connection(int i) throws RemoteException{
        super(i);
        vod = new VODService(i);

    }
    /*
    * Methode permettant de vérifier si le couple mail/mdp est correct
    * meme si une liste a un cout de vérification plus faible, nous avons décidé
    * de n'utiliser que le CSV pour la gestion de compte en ignorant la perte de performance potentielle
     */
    boolean CSVcontains(String mail, String pwd) throws IOException {
        String row;
        BufferedReader csvReader = new BufferedReader(new FileReader("./data/users.csv"));
        while ((row = csvReader.readLine()) != null) {
            String[] data = row.split(",");
            if (data[0].equals(mail) && data[1].equals(Connection.encode(pwd))){
                return true;
            }
        }

        csvReader.close();
        return false;
    }

    /*
    * Methode permettant de vérifier si mail est déjà utilisé
     */
    boolean CSVcontains(String mail) throws IOException {
        String row;
        BufferedReader csvReader = new BufferedReader(new FileReader("./data/users.csv"));
        while ((row = csvReader.readLine()) != null) {
            String[] data = row.split(",");
            if (data[0].equals(mail)){
                return true;
            }
        }

        csvReader.close();
        return false;
    }


    /*
    * Methode permettant de hasher le mot de passe
     */
    public static String encode(String password)
    {
        try
        {
            MessageDigest m = MessageDigest.getInstance("MD5");
            m.update(password.getBytes());
            byte[] bytes = m.digest();
            StringBuilder s = new StringBuilder();
            for(int i=0; i< bytes.length ;i++)
            {
                s.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }
            return s.toString();
        }
        catch (NoSuchAlgorithmException e)
        {
            e.printStackTrace();
            return null;
        }
    }

    /*
    * Methode permettant d'écrire dans le fichier CSV des utilisateurs pour les sauvegarder
     */
    void writeCSV(String mail, String pwd){
        try {
            Files.write(Paths.get("./data/users.csv"), (mail+','+Connection.encode(pwd)+'\n').getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /*
    * Methode permettant d'enregistrer un utilisateur dans le fichier CSV
     */
    @Override
    public boolean register(String mail, String pwd) throws RemoteException, SignUpFailed {
        try {
            if(CSVcontains(mail)){
                throw new SignUpFailed();
            }
            else{
                writeCSV(mail,pwd);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }

    /*
    * Methode permettant à un utilisateur de se connecter
     */
    @Override
    public IVODService login(String mail, String pwd) throws RemoteException, InvalidCredentialException {
        User log = new User(mail, pwd);
        try {
            if (CSVcontains(mail,pwd)){
                return vod;
            }

                throw new InvalidCredentialException();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
