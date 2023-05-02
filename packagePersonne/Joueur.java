package packagePersonne;

import packageException.PersonneException;

public class Joueur extends Personne {
    
    private String poste;
 

    public Joueur(final String nom, final String prenom, final String naiss , final String position) throws PersonneException
    {
        super(nom,prenom,naiss);
        setPoste(position);
    }

    public Joueur() throws PersonneException
    {
        super();
        setPoste("12e homme");
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

    @Override
    public String toString() 
    {
        return super.toString() + "poste=" + getPoste() ;
    }

}
