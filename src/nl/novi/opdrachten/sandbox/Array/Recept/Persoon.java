package nl.novi.opdrachten.sandbox.Array.Recept;

class Persoon {
    String naam;
    int leeftijd;

    Persoon(String naam, int leeftijd){
        this.naam = naam;
        this.leeftijd = leeftijd;
    }

    public String getNaam() {
        return naam;
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    void toonInfo(){
        System.out.println(naam + " is " + leeftijd +  " jaar oud");
    }

    @Override
    public String toString() {
        return "Persoon{" +
                "naam='" + naam + '\'' +
                ", leeftijd=" + leeftijd +
                '}';
    }
}