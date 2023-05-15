import packagePersonne.*;
import packageClub.*;
import packageException.*;

public class Main {

    public static void main(String[] args) throws PersonneException {
        testPersonne();
        testEntraineur();
        testJoueur();
        
        testEquipe();
        testMatch();
        testFootballClub();
    }

    
    public static void testPersonne() 
    {

        //Personne personne1 = new Personne();
    }

    private static void testEntraineur() throws PersonneException
    {
        System.out.println("testEntraineur:\n\n");
        // Création d'une instance de la classe Entraineur avec le constructeur vide
        Entraineur entraineur1 = new Entraineur();
        
        // Utilisation des setters pour initialiser les attributs
        entraineur1.setNom("mourinho");
        entraineur1.setPrenom("jose");
        entraineur1.setDateNaiss("26/01/1963");
        entraineur1.setDiplome("UEFA Pro");
        
        // Utilisation de la méthode toString pour afficher les attributs de l'objet
        System.out.println("entraineur3:" +entraineur1.toString());
        
        // Création d'une instance de la classe Entraineur avec le constructeur paramétré
        Entraineur entraineur2 = new Entraineur("belek", "wasim", "10/04/2000", "UEFA B");
        System.out.println("entraineur3: "+entraineur2.toString());

        //creation d'un Entraineur avec le contructeur par defaut
        Entraineur entraineur3 = new Entraineur();
        System.out.println("entraineur3:" + entraineur3.toString());

        System.out.println("\n--------------------------------------------------------");

    }

    public static void testJoueur() throws PersonneException 
    {
        System.out.println("testJoueur:\n\n");
        Joueur joueur1 = new Joueur();
        
        joueur1.setNom("Dupont");
        joueur1.setPrenom("Jean");
        joueur1.setDateNaiss("12/05/1990");
        joueur1.setPoste("Attaquant");
        
        System.out.println(joueur1.toString());
        
        try {
            Joueur joueur2 = new Joueur("mbaya", "luce-emmanuel", "23/09/2002", "Défenseur");
            System.out.println(joueur2.toString());
        } catch (PersonneException e) {
            e.printStackTrace();
        }
        System.out.println("\n--------------------------------------------------------");

    
    }

    public static void testEquipe() throws PersonneException 
    {
        System.out.println("testEquipe:\n\n");
        
        Equipe equipe = new Equipe("1ere");
        
        // Ajout de joueurs
        Joueur joueur1 = new Joueur("tortolani", "guillaume", "22/09/2002","Attaquant");
        Joueur joueur2= new Joueur("matuidi", "charo", "06/04/1980", "Millieu");
        Joueur joueur3 = new Joueur("mbaya", "luce-emmanuel", "23/09/2002", "Défenseur");
        equipe.ajouterJoueur(joueur1);
        equipe.ajouterJoueur(joueur2);
        equipe.ajouterJoueur(joueur3);

        
        // Ajout d'entraîneurs
        Entraineur entraineur1 = new Entraineur("mourinho", "jose", "26/01/1963", "UEFA Pro");
        Entraineur entraineur2 = new Entraineur("Ancelotti", "Carlo", "10/06/1959", "UEFA Pro");
        equipe.ajouterEntraineur(entraineur1);
        equipe.ajouterEntraineur(entraineur2);

        // Ajout de matchs
        Match match1 = new Match("Stade 1", "Equipe A", "2022-06-01");
        Match match2 = new Match("Stade 2", "FC Mon jardin", "2023-06-08");
        equipe.ajouterMatch(match1);
        equipe.ajouterMatch(match2);
        
        // Affichage des informations de l'équipe
        System.out.println(equipe.toString());
        
        // Suppression d'un joueur
        equipe.supprimerJoueur(joueur1);
        equipe.supprimerMatch(match2);
        equipe.supprimerEntraineur(entraineur2);

        System.out.println("Apres suppression d'un joueur, match et entraineur:");
        System.out.println(equipe.toString());

        System.out.println("\n--------------------------------------------------------");

        
    }

    

    public static void testMatch() 
    {
        System.out.println("testMatch:\n\n");


        Match match1 = new Match("Stade des martir", "TP Mazembe", "2023-05-17");
        System.out.println(match1.toString());
        
        match1.setLieu("Stade De France");
        match1.setAdversaire("PSG");
        match1.setDate("2023-06-01");
        System.out.println(match1.toString());

        System.out.println("\n--------------------------------------------------------");

    }

    public static void testFootballClub() throws PersonneException 
    {
        System.out.println("testFootballClub:\n\n");


        Equipe equipe1= new Equipe("1ere");
        
        // Ajout de joueurs
        Joueur joueur1 = new Joueur("tortolani", "guillaume", "22/09/2002","Attaquant");
        Joueur joueur2= new Joueur("matuidi", "charo", "06/04/1980", "Millieu");
        Joueur joueur3 = new Joueur("mbaya", "luce-emmanuel", "23/09/2002", "Défenseur");
        equipe1.ajouterJoueur(joueur1);
        equipe1.ajouterJoueur(joueur2);
        equipe1.ajouterJoueur(joueur3);

        
        // Ajout d'entraîneurs
        Entraineur entraineur1 = new Entraineur("mourinho", "jose", "26/01/1963", "UEFA Pro");
        Entraineur entraineur2 = new Entraineur("Ancelotti", "Carlo", "10/06/1959", "UEFA Pro");
        equipe1.ajouterEntraineur(entraineur1);
        equipe1.ajouterEntraineur(entraineur2);

        // Ajout de matchs
        Match match1 = new Match("Stade 1", "Équipe A", "2022-06-01");
        Match match2 = new Match("Stade 2", "FC Mon jardin", "2023-06-08");
        equipe1.ajouterMatch(match1);
        equipe1.ajouterMatch(match2);

        // Ajout de l'équipe au club
        FootballClub club = FootballClub.getInstance();
        club.ajouterEquipe(equipe1);

        // Affichage du club
        System.out.println("Club: "+club.toString());

        FootballClub clubB = FootballClub.getInstance();
        System.out.println("ClubB: "+clubB.toString());

        System.out.println("\n--------------------------------------------------------");


    }
}
