package packageClub;

import java.util.ArrayList;
import java.util.Collections;
import java.io.*;

import packagePersonne.Entraineur;
import packagePersonne.Joueur;


public class Equipe implements Serializable, Comparable<Equipe>{
  
    private String categorie;
    private ArrayList<Joueur> joueurs;
    private ArrayList<Entraineur> entraineurs;
    private ArrayList<Match> matches;

    public Equipe(final String categorie ) {
        setCategorie(categorie);
        /*this.joueurs = new ArrayList<>();
        this.entraineurs = new ArrayList<>();
        this.matches = new ArrayList<>();*/
    }

    public Equipe() {
        setCategorie("VIDE");
        this.joueurs = new ArrayList<>();
        this.entraineurs = new ArrayList<>();
        this.matches = new ArrayList<>();
    }

    public void ajouterJoueur(Joueur joueur) {
        joueurs.add(joueur);
        Collections.sort(joueurs, Joueur.ComparatorNom);
        Collections.sort(joueurs, Joueur.ComparatorPrenom);
    }

    public void supprimerJoueur(Joueur joueur) {
        joueurs.remove(joueur);
    }

    public void ajouterEntraineur(Entraineur entraineur) {
        entraineurs.add(entraineur);
        Collections.sort(entraineurs, Entraineur.ComparatorNom);
        Collections.sort(entraineurs, Entraineur.ComparatorPrenom);
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
        sb.append("Categorie de l'equipe: " + "U" + getCategorie() + " : \n");
        sb.append("Nombre de joueurs : " + joueurs.size() + "\n");
        sb.append("Nombre d'entraineurs : " + entraineurs.size() + "\n");
        sb.append("Nombre de matchs : " + matches.size() + "\n");
        
        sb.append("Liste des joueurs : \n");
        for (Joueur joueur : joueurs) {
            sb.append("- " + joueur.toString()+"\n");
        }
        
        sb.append("Liste des entraineurs : \n");
        for (Entraineur entraineur : entraineurs) {
            sb.append("- "+ entraineur.toString() +"\n");
        }
        
        sb.append("Liste des matchs : \n");
        for (Match match : matches) {
            sb.append("- "+ match.toString() + "\n");
        }
        return sb.toString();
    }
    @Override
    public boolean equals(Object o) 
    {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Equipe)) {
            return false;
        }
        Equipe other = (Equipe) o;
        return this.categorie.equals(other.categorie) &&
            this.joueurs.equals(other.joueurs) &&
            this.entraineurs.equals(other.entraineurs) &&
            this.matches.equals(other.matches);
    }

    @Override
    public int compareTo(Equipe o) 
    {
        return(this.categorie.compareTo(o.getCategorie()));   
    }

    public void save(String filename) throws IOException 
    {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filename))) {
            outputStream.writeObject(this);
        }
    }

    public Equipe load(String filename) throws FileNotFoundException, IOException, ClassNotFoundException 
    {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(filename))) {
            return (Equipe) inputStream.readObject();
        }
    }

}

