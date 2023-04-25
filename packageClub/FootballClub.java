package packageClub;

import java.util.ArrayList;
import java.util.List;

public class FootballClub {
    
    private static FootballClub instance;
    private List<Equipe> equipes;

    public static FootballClub getInstance() {
        if(instance==null)
        {
            instance= new FootballClub();
        }
        return instance;
    }

    public FootballClub() {
        equipes = new ArrayList<>();
    }

    public void ajouterEquipe(Equipe equipe) {
        equipes.add(equipe);
    }

    public void supprimerEquipe(Equipe equipe) {
        equipes.remove(equipe);
    }

    public List<Equipe> getEquipe() {
        return equipes;
    }

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
    

}

