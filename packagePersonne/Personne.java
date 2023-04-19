package packagePersonne;

public class Personne {
    
    private String nom;
    private String prenom;
    private String datenaiss;

    public Personne(final String n, final String p, final String nais)
    {
        setNom(n);
        setPrenom(p);
        setDateNaiss(nais);
    }
    public void setNom(final String n)
    {
        this.nom=n;
    }
    String getNom()
    {
        return nom;
    }
    
    public void setPrenom(final String p)
    {
        this.prenom=p;
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

}
