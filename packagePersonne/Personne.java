package packagePersonne;
import packageException.PersonneException;
import packageUtility.Tool;


public abstract class Personne {
    
    private String nom;
    private String prenom;
    private String datenaiss;

    public Personne(final String n, final String p, final String nais) throws PersonneException
    {
        setNom(n);
        setPrenom(p);
        setDateNaiss(nais);
    }

    public Personne() throws PersonneException
    {
        setNom("vide");
        setPrenom("vide");
        setDateNaiss("99/99/9999");

    }
    public void setNom(String n) throws PersonneException
    {
        if(Tool.contientChiffres(n)==true){ throw new PersonneException("Le nom ne doit pas contenir de chiffres");}
        
        this.nom=Tool.SetUpper(n);
    }
    String getNom()
    {
        return nom;
    }
    
    public void setPrenom(final String p) throws PersonneException
    {
        if(Tool.contientChiffres(p)==true){ throw new PersonneException("Le prenom ne doit pas contenir de chiffres");}
        this.prenom=Tool.SetUpper(p);
    }
    String getPrenom()
    {
        return prenom;
    }

    public void setDateNaiss(final String naiss)
    {
        datenaiss=naiss;
    }
    String getDateNaiss()
    {
        return datenaiss;
    }
    
        
    @Override
    public String toString() 
    {
        return "nom=" + getNom() + ", prenom=" + getPrenom() + ", dateNaissance=" + getDateNaiss();
    }
 
}
