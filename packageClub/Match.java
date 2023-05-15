package packageClub;

import java.io.*;

public class Match implements Serializable {
    
    private String lieu;
    private String adversaire; 
    private String date;

    public Match(final String lieu,final String adversaire, final String date )
    {
        setLieu(lieu);
        setAdversaire(adversaire);
        setDate(date);
    }
    public Match()
    {
        setLieu("VIDE");
        setAdversaire("VIDE");
        setDate("99/99/9999");
    }

    public void setLieu(String lieu) 
    {
        this.lieu = lieu;
    }
    public String getLieu() 
    {
        return lieu;
    }

    public void setAdversaire(String adversaire) 
    {
        this.adversaire = adversaire;
    }
    public String getAdversaire() 
    {
        return adversaire;
    }

    public void setDate(String date) 
    {
        this.date = date;
    }
    public String getDate() 
    {
        return date;
    }

    @Override
    public String toString() 
    {
    return "lieu=" + getLieu()+ ", adversaire=" + getAdversaire() +", date=" + getDate() ;
    }

    @Override
    public boolean equals(Object o) 
    {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Match)) {
            return false;
        }
        Match m = (Match) o;
        return this.adversaire.equals(m.getAdversaire()) &&
                this.lieu.equals(m.getLieu()) &&
                this.date.equals(m.getDate());
    }

    public void save(String filename) throws IOException 
    {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filename))) {
            outputStream.writeObject(this);
        }
    }

    public Match load(String filename) throws FileNotFoundException, IOException, ClassNotFoundException 
    {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(filename))) {
            return (Match) inputStream.readObject();
        }
    }


    


    
}
