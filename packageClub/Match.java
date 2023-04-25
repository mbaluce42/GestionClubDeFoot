package packageClub;

public class Match {
    
    private String lieu;
    private String adversaire; 
    private String date;

    public Match(final String lieu,final String adversaire, final String date )
    {
        setLieu(lieu);
        setAdversaire(adversaire);
        setDate(date);
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }
    public String getLieu() {
        return lieu;
    }

    public void setAdversaire(String adversaire) {
        this.adversaire = adversaire;
    }
    public String getAdversaire() {
        return adversaire;
    }

    public void setDate(String date) {
        this.date = date;
    }
    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
    return "lieu=" + getLieu()+ ", adversaire=" + getAdversaire() +", date=" + getDate() ;
}

    
}
