package packagePersonne;

import packageException.PersonneException;

import java.io.*;
import java.util.Comparator;

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
        return super.toString() + ", poste=" + getPoste() ;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Joueur)) {
            return false;
        }
        Joueur other = (Joueur) obj;
        return this.getNom().equals(other.getNom()) &&
            this.getPrenom().equals(other.getPrenom()) &&
            this.getDateNaiss().equals(other.getDateNaiss()) &&
            this.getPoste().equals(other.getPoste());
    }

    
    //Comparator pour le tri des Joueur par Nom 
    public static Comparator<Joueur> ComparatorNom = new Comparator<Joueur>() 
    {

        @Override
        public int compare(Joueur j1, Joueur j2) 
        {
            return j1.getNom().compareTo(j2.getNom());   
        }
    };


    //Comparator pour le tri des Joueur par Prenom 
    public static Comparator<Joueur> ComparatorPrenom = new Comparator<Joueur>() 
    {

        @Override
        public int compare(Joueur j1, Joueur j2) 
        {
            return j1.getPrenom().compareTo(j2.getPrenom());   
        }
    };


    /*public void Save(final String filename) throws IOException 
    {
        super.Save("Joueur.csv");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) 
        {
            writer.write(String.format("%s", getPoste()));
        }
        
    }
    
    public void Load(String filename) throws IOException, PersonneException 
    {
        //super.Load("Joueur.csv");
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) 
        {
            String line = reader.readLine();
            String[] data = line.split(";");
            if (data.length != 4) {
                throw new PersonneException("Le fichier ne contient pas les données nécessaires.");
            }
            setNom(data[0]);
            setPrenom(data[1]);
            setDateNaiss(data[2]);
            setPoste(data[3]);
        }
    }*/

    public void save(String filename) throws IOException 
    {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filename))) {
            outputStream.writeObject(this);
        }
    }

    public Joueur load(String filename) throws FileNotFoundException, IOException, ClassNotFoundException 
    {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(filename))) {
            return (Joueur) inputStream.readObject();
        }
    }


}
