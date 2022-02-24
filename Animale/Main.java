package ro.itschool.Animale;

public class Main {

    public static void main(String[] args) {

        Pisica pisica = new Pisica("Tuti");
        pisica.toarce();
        pisica.toarce();

        //daca vreau sa creed 20 de pisici
        Pisica[] pisicileMele = new Pisica[20];
        for(int i = 0; i < pisicileMele.length; i++){
            pisicileMele[i] = new Pisica("Pisica numarul " + i );
        }

    }
}
