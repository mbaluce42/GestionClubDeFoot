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

}

