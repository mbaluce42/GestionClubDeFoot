package packagePersonne;

public class Joueur extends Personne {
    
    private String poste;

    public Joueur(final String nom, final String prenom, final String naiss , final String position)
    {
        super(nom,prenom,naiss);
        setPoste(position);
    }

    public void setPoste(final String pos)
    {
        //faire une verification 
        this.poste=pos;
    }
    public String getPoste()
    {
        return poste;
    }

}
