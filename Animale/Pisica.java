package ro.itschool.Animale;

public class Pisica {

    private String nume;
    private  int vasrsta;

    public Pisica(String nume){
        this.nume = nume;
        this.vasrsta = 1;
    }

    public void toarce(){
        System.out.println("Miauuu");
    }
}
