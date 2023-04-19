package packageClub;

import java.util.ArrayList;
import java.util.List;

import packagePersonne.Entraineur;
import packagePersonne.Joueur;

public class Equipe{
     
    private String categorie;
    private List<Joueur> joueurs;
    private List<Entraineur> entraineurs;
    private List<Match> matches;

    public Equipe(final String categorie ) {
        setCategorie(categorie);
        joueurs = new ArrayList<>();
        entraineurs = new ArrayList<>();
        matches = new ArrayList<>();
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

    public List<Joueur> getJoueurs() {
        return joueurs;
    }

    public List<Entraineur> getEntraineurs() {
        return entraineurs;
    }

    public List<Match> getMatches() {
        return matches;
    }

   
    
}

