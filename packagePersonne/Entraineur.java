package packagePersonne;

public class Entraineur extends Personne {

    private String diplome;
    private int categorie; 

    public Entraineur(final String nom, final String prenom, final String naiss , final String dipl,final int cat)
    {
        super(nom,prenom,naiss);
        setDiplome(dipl);
        setCategorie(cat);
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
    
}
