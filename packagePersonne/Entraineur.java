package packagePersonne;

import java.util.ArrayList;
import java.util.Comparator;

import packageException.PersonneException;
import java.io.*;

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

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Entraineur)) {
            return false;
        }
        Entraineur e = (Entraineur) o;
        return super.equals(e) && this.diplomes.equals(e.getDiplome());
    }

     //Comparator pour le tri des Entraineur par Nom 
     public static Comparator<Entraineur> ComparatorNom = new Comparator<Entraineur>() 
     {
         @Override
         public int compare(Entraineur e1, Entraineur e2) 
         {
             return e1.getNom().compareTo(e2.getNom());   
         }
     };
 
 
     //Comparator pour le tri des Entraineur par Prenom 
     public static Comparator<Entraineur> ComparatorPrenom = new Comparator<Entraineur>() 
     {
         @Override
         public int compare(Entraineur e1, Entraineur e2) 
         {
             return e1.getPrenom().compareTo(e2.getPrenom());   
         }
     };
 

    public void save(String filename) throws IOException 
    {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filename))) {
            outputStream.writeObject(this);
        }
    }

    public Entraineur load(String filename) throws FileNotFoundException, IOException, ClassNotFoundException 
    {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(filename))) {
            return (Entraineur) inputStream.readObject();
        }
    }

    
    
}
