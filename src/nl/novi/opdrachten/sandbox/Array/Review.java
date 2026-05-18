package nl.novi.opdrachten.sandbox.Array;

class Review {
    private Persoon schrijver; //composition/object gebruik
    private int score;
    private String reactie ;

    public Review(Persoon schrijver, int score, String reactie){
        this.schrijver = schrijver;
        this.score = score;
        this.reactie = reactie;
    }

    public void  toonReview() {
        System.out.println("Reviewer : " + schrijver.getNaam());
        System.out.println("Score : " + score + "/10");
        System.out.println("Reactie : " + reactie);
        System.out.println("------------------------------------");
    }
}