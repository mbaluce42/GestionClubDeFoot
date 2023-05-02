package packageClub;

import java.util.ArrayList;

import packagePersonne.Entraineur;
import packagePersonne.Joueur;


public class Equipe{
  
    private String categorie;
    private ArrayList<Joueur> joueurs;
    private ArrayList<Entraineur> entraineurs;
    private ArrayList<Match> matches;

    public Equipe(final String categorie ) {
        setCategorie(categorie);
        this.joueurs = new ArrayList<>();
        this.entraineurs = new ArrayList<>();
        this.matches = new ArrayList<>();
    }

    public void ajouterJoueur(Joueur joueur) {
        joueurs.add(joueur);
    }

    public void supprimerJoueur(Joueur joueur) {
        joueurs.remove(joueur);
    }

    public void ajouterEntraineur(Entraineur entraineur) {
        entraineurs.add(entraineur);
    }

    public void supprimerEntraineur(Entraineur entraineur) {
        entraineurs.remove(entraineur);
    }

    public void ajouterMatch(Match match) {
        matches.add(match);
    }

    public void supprimerMatch(Match match) {
        matches.remove(match);
    }

    public void setCategorie(final String categorie) {
        this.categorie= categorie;
    }
    public String getCategorie() {
        return categorie;
    }

    public ArrayList<Joueur> getJoueurs() {
        return joueurs;
    }

    public ArrayList<Entraineur> getEntraineurs() {
        return entraineurs;
    }

    public ArrayList<Match> getMatches() {
        return matches;
    }

    @Override
    public String toString() 
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Catégorie de l'equipe: " + "U" + getCategorie() + " : \n");
        sb.append("Nombre de joueurs : " + joueurs.size() + "\n");
        sb.append("Nombre d'entraîneurs : " + entraineurs.size() + "\n");
        sb.append("Nombre de matchs : " + matches.size() + "\n");
        
        sb.append("Liste des joueurs : \n");
        for (Joueur joueur : joueurs) {
            sb.append("- " + joueur.toString()+"\n");
        }
        
        sb.append("Liste des entraîneurs : \n");
        for (Entraineur entraineur : entraineurs) {
            sb.append("- "+ entraineur.toString() +"\n");
        }
        
        sb.append("Liste des matchs : \n");
        for (Match match : matches) {
            sb.append("- "+ match.toString() + "\n");
        }
        return sb.toString();
    }

}

