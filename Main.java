import java.util.Scanner;

import packageClub.Equipe;
import packageClub.FootballClub;
import packageClub.Match;
//import packageClub.Match;
import packagePersonne.Entraineur;
import packagePersonne.Joueur;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Création de l'objet FootballClub
            FootballClub club = FootballClub.getInstance();

            // Création de deux équipes
            System.out.println("Création de deux équipes :");

            System.out.print("Catégorie de l'équipe 1 : ");
            String categorieEquipe1 = scanner.nextLine();
            Equipe equipe1 = new Equipe(categorieEquipe1);
            club.ajouterEquipe(equipe1);

            System.out.print("Catégorie de l'équipe 2 : ");
            String categorieEquipe2 = scanner.nextLine();
            Equipe equipe2 = new Equipe(categorieEquipe2);
            club.ajouterEquipe(equipe2);

            // Création de deux joueurs pour l'équipe 1
            System.out.println("\nCréation de deux joueurs pour l'équipe 1 :");

            System.out.print("Nom du joueur 1 : ");
            String nomJoueur1 = scanner.nextLine();
            System.out.print("Prénom du joueur 1 : ");
            String prenomJoueur1 = scanner.nextLine();
            System.out.print("date de naissance du joueur 1 : ");
            String dateJoueur1 = scanner.nextLine();
            System.out.print("Position de predilection du joueur 1 : ");
            String positionJoueur1 = scanner.nextLine();

            scanner.nextLine(); // Pour consommer le retour à la ligne

            Joueur joueur1 = new Joueur(nomJoueur1, prenomJoueur1,dateJoueur1 ,positionJoueur1);
            equipe1.ajouterJoueur(joueur1);

            System.out.print("Nom du joueur 2 : ");
            String nomJoueur2 = scanner.nextLine();
            System.out.print("Prénom du joueur 2 : ");
            String prenomJoueur2 = scanner.nextLine();
            System.out.print("date de naissance du joueur 2 : ");
            String dateJoueur2 = scanner.nextLine();
            System.out.print("Position de predilection du joueur 2 : ");
            String positionJoueur2 = scanner.nextLine();
            scanner.nextLine(); // Pour consommer le retour à la ligne
            Joueur joueur2 = new Joueur(nomJoueur2, prenomJoueur2, dateJoueur2,positionJoueur2);
            equipe1.ajouterJoueur(joueur2);

            // Création d'un entraîneur pour l'équipe 2
            System.out.println("\nCréation d'un entraîneur pour l'équipe 2 :");

            System.out.print("Nom de l'entraîneur : ");
            String nomEntraineur = scanner.nextLine();
            System.out.print("Prénom de l'entraîneur : ");
            String prenomEntraineur = scanner.nextLine();
            System.out.print("DateNaiss de l'entraîneur : ");
            String DateNaisEntraineur = scanner.nextLine();
            System.out.print("diplome de l'entraîneur : ");
            String DiplomeEntraineur = scanner.nextLine();
            System.out.print("Categorie de l'entraîneur : ");
            int CatEntraineur = scanner.nextInt();
            scanner.nextLine();
            Entraineur entraineur = new Entraineur(nomEntraineur, prenomEntraineur,DateNaisEntraineur,DiplomeEntraineur,CatEntraineur);
            equipe2.ajouterEntraineur(entraineur);

            // Ajout d'un match pour l'équipe 1
            System.out.println("\nAjout d'un match pour l'équipe 1 :");


            System.out.print("Lieu du match : ");
            String lieuMatch = scanner.nextLine();
            System.out.print("Adversaire : ");
            String adversaireMatch = scanner.nextLine();
            System.out.print("Date du match (jj/mm/aaaa) : ");
            String dateMatch = scanner.nextLine();
            scanner.nextLine();
            //System.out.print("Résultat (ex : 3-1) : ");
            //String resultatMatch = scanner.nextLine();
            Match match1 = new Match(lieuMatch, adversaireMatch, dateMatch);
            equipe1.ajouterMatch(match1);
   
            // Affichage des informations des équipes
            System.out.println("\nInformations des équipes :");
   
            System.out.println("Equipe 1 : " + equipe1);
            System.out.println("Equipe 2 : " + equipe2);
            club.ajouterEquipe(equipe2);
            club.ajouterEquipe(equipe1);
        }
    }
}
    
