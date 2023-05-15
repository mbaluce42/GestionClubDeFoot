package packagePersonne;
import packageException.PersonneException;
import packageUtility.Tool;

import java.io.*;


public abstract class Personne implements Serializable {
    
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

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof Personne)) {
            return false;
        }

        Personne p = (Personne) obj;

        return this.getNom().equals(p.getNom())
                && this.getPrenom().equals(p.getPrenom())
                && this.getDateNaiss().equals(p.getDateNaiss());
    }



    /*public void Save(final String filename) throws IOException 
    {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) 
        {
            writer.write(String.format("%s;%s;%s", getNom(), getPrenom(), getDateNaiss()));
        }
    }
    
    public void Load(final String fileName) throws PersonneException, IOException 
    {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) 
        {
            String line = reader.readLine();
            String[] data = line.split(";");
                
            setNom(data[0]);
            setPrenom(data[1]);
            setDateNaiss(data[2]);
        }
    }*/

    public void save(String filename) throws IOException {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filename))) {
            outputStream.writeObject(this);
        }
    }

    public Personne load(String filename) throws FileNotFoundException, IOException, ClassNotFoundException {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(filename))) {
            return (Personne) inputStream.readObject();
        }
    
    }

}
