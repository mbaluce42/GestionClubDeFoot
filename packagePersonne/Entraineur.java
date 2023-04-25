package packagePersonne;

import java.util.List;

import packageException.PersonneException;

public class Entraineur extends Personne {

    private String diplome;
    private List<String> diplomes; 

    public List<String> getDiplomes() {
        return diplomes;
    }

    public void setDiplomes(List<String> diplomes) {
        this.diplomes = diplomes;
    }

    public Entraineur(final String nom, final String prenom, final String naiss , final String dipl) throws PersonneException
    {
        super(nom,prenom,naiss);
        setDiplome(dipl);
        //setCategorie(catEntraineur);
    }

    public void setDiplome(final String diplome)
    {
        this.diplome=diplome;
    }
    public String getDiplome()
    {
        return diplome;
    }

    public void setCategorie(final int categorie)
    {
        this.categorie=categorie;
    }
    public int getCategorie()
    {
        return categorie;
    }

    @Override
    public String toString() 
    {
        return super.toString() + ", diplome=" + getDiplome() + ", categorie=" + getCategorie();
    }
    
    
}
