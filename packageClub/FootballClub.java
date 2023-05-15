package packageClub;

import java.util.ArrayList;
import java.util.Collections;
import java.io.*;

public class FootballClub implements Serializable{
    
    private static FootballClub instance;
    private ArrayList<Equipe> equipes;

    public static FootballClub getInstance() {
        if(instance==null)
        {
            instance= new FootballClub();
        }
        return instance;
    }

    public FootballClub() {
        this.equipes = new ArrayList<>();
    }

    public void ajouterEquipe(Equipe equipe) {
        equipes.add(equipe);
        Collections.sort(equipes);
    }

    public void supprimerEquipe(Equipe equipe) {
        equipes.remove(equipe);
    }

    public ArrayList<Equipe> getEquipe() {
        return equipes;
    }

    @Override
    public String toString() 
    {
        StringBuilder sb = new StringBuilder();
        sb.append("FootballClub : \n");
        sb.append("Nombre d'équipes : " + equipes.size() + "\n");
    
        for (Equipe equipe : equipes) {
            sb.append(equipe.toString() + "\n" );
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
        FootballClub other = (FootballClub) o;
        return this.equipes.equals(other.equipes);
    }

    public void save(String filename) throws IOException {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filename))) {
            outputStream.writeObject(this);
        }
    }

    public FootballClub load(String filename) throws FileNotFoundException, IOException, ClassNotFoundException 
    {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(filename))) {
            return (FootballClub) inputStream.readObject();
        }
    }
}

