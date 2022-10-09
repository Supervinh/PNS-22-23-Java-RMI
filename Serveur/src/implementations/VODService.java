/*
 @author: Bourdeau Quentin
          Faucher Vinh

 */
package implementations;

import contrats.IConnection;
import contrats.IVODService;

import java.nio.charset.StandardCharsets;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

/**
 * CLasse implementant l'interface IVODService et contenant le catalogue de films
 */
public class VODService extends UnicastRemoteObject implements IVODService {

    private List<MovieDesc> Catalog;
    private List<Movie> listMovies;

    VODService(int port) throws RemoteException {
        super(port);
        Catalog = new ArrayList<>();
        listMovies = new ArrayList<>();
        inizialize();
    }

    /*
     * Methode permettant d'envoyer le catalogue de films au client
     */
    @Override
    public List<MovieDesc> viewCatalog() throws RemoteException {
        return Catalog;
    }

    /*
     * Methode permettant de lancer le film voulu à partir de son ISBN
     */
    @Override
    public Bill playmovie(String isbn, IConnection box) throws RemoteException{
        return null;
    }

    /*
     * Methode permettant d'initialiser le catalogue de films
     */
    void inizialize(){
        Catalog.add(new MovieDesc("The Godfather","108-2-506-907-98-6","En 1945, à New York, les Corleone sont une des 5 familles de la mafia. Don Vito Corleone, `parrain' de cette famille, marie sa fille à un bookmaker. Sollozzo, `parrain' de la famille Tattaglia, propose à Don Vito une association dans le trafic de drogue, mais celui-ci refuse. Sonny, un de ses fils, y est quant à lui favorable. Afin de traiter avec Sonny, Sollozzo tente de faire tuer Don Vito, mais celui-ci en réchappe.",new Bill(5,"The Godfather")));
        Catalog.add(new MovieDesc("Kenshin : L'Achèvement", "250-5-754-680-95-6", "En 1879, Kenshin se bat avec ses alliés contre son plus grand ennemi : son ancien beau-frère Enishi Yukishiro, entouré de ses sbires qui ont juré de se venger.", new Bill(7,"Kenshin : L'Achèvement")));
        Catalog.add(new MovieDesc("The Dark Knight", "978-2-364-800-65-6", "Batman, le chevalier noir, est de retour. Il est aidé par le lieutenant Jim Gordon et le procureur Harvey Dent, qui ont décidé de nettoyer la ville de ses criminels. Mais le Joker, un dangereux psychopathe, est déterminé à faire régner la terreur et à détruire la ville.", new Bill(10,"The Dark Knight")));
        Catalog.add(new MovieDesc("The Lord of the Rings: The Return of the King", "500-7-354-674-40-7", "Frodon et Sam continuent leur route vers la Comté, accompagnés de Gollum. Pendant ce temps, Aragorn, Legolas et Gimli, rejoints par Merry et Pippin, partent à la rescousse d'Éowyn et Théoden, prisonniers de Saroumane, tandis que Gandalf affronte le Nazgûl.", new Bill(8,"The Lord of the Rings: The Return of the King")));
        Catalog.add(new MovieDesc("The Lord of the Rings: The Fellowship of the Ring", "700-3-456-987-12-3", "Frodon, un hobbit, hérite d'un anneau magique. Il est alors entraîné dans une aventure pour détruire l'anneau avant qu'il ne tombe entre les mains du Seigneur des ténèbres.", new Bill(8,"The Lord of the Rings: The Fellowship of the Ring")));

        listMovies.add(new Movie("108-2-506-907-98-6", "neropghntuoprhgnup trupt".getBytes(StandardCharsets.UTF_8)));
        listMovies.add(new Movie("250-5-754-680-95-6", "nr^goh iqerhgp jer".getBytes(StandardCharsets.UTF_8)));
        listMovies.add(new Movie("978-2-364-800-65-6", "fhizroup frpzqh tpqr hp".getBytes(StandardCharsets.UTF_8)));
        listMovies.add(new Movie("500-7-354-674-40-7", "jngoept sghtesp etoirh te hp".getBytes(StandardCharsets.UTF_8)));
        listMovies.add(new Movie("700-3-456-987-12-3", "rhugfp zreuth uepzrh tuerz htezruptuh erzpt ".getBytes(StandardCharsets.UTF_8)));
    }
}
