package nl.novi.opdrachten.sandbox.Array.Recept;

class LijstArrayMetObjecten {

    public static void main(String[] args){

        //Array met 3 Persoon-objecten
        Persoon[] personen = new Persoon[3];

        //Objecten toevoegen
        personen[0] = new Persoon("Jan", 25);
        personen[1] = new Persoon("Emma", 30);
        personen[2] = new Persoon("Ali",  22);

        // Door array lopen
        for (Persoon p : personen){
            p.toonInfo();
        }

    }
}