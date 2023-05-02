package packagePersonne;

import java.util.ArrayList;

import packageException.PersonneException;

public class Entraineur extends Personne {

    private ArrayList<String> diplomes; //4

    

    public Entraineur(final String nom, final String prenom, final String naiss , final String dipl) throws PersonneException
    {
        super(nom,prenom,naiss);
        this.diplomes = new ArrayList<String>(4);
        setDiplome(dipl);
        //setCategorie(catEntraineur);
    }

    public Entraineur() throws PersonneException
    {
        super();
        this.diplomes = new ArrayList<String>(4);
        setDiplome("vide");
    }

    

    public void setDiplome(final String diplome) {
        this.diplomes.add(diplome);
    }

    public ArrayList<String> getDiplome() {
        return diplomes;
    }

    /*public void setCategorie(final int categorie)
    {
        this.categorie=categorie;
    }
    public int getCategorie()
    {
        return categorie;
    }*/

    @Override
    public String toString() 
    {
        StringBuilder sb = new StringBuilder();

        sb.append(" Liste des diplomes : \n");
        for (String dipl : diplomes) {
            sb.append("- " + dipl +"\n");
        }

        return super.toString() + ","+ sb.toString() /*+ ", categorie=" + getCategorie()*/;
    }
    
    
}
