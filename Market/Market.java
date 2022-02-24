package ro.itschool.Market;

import java.util.Scanner;

public class Market {

    private String name;
    private boolean descshis;

    public Market(String name){
        this.name = name;
        this.descshis = false;
    }
    // metodele reprezinta comportamentul unei clase
    public void setName(String name){
        this.name = name;
    }
    public void inchideMagazin(){
        this.descshis = false;
    }

    public void deschideMagazin(){
        this.descshis = true;
    }

    public void vinde(){
        if(this.descshis == false)// sau !this.deschis
            {
                System.out.println("Magazinul este inchis");
            } else {
            System.out.println("Ce vreti sa cumparati:");
            Scanner input = new Scanner(System.in);
            String produs = input.nextLine();
            System.out.println("Felicitari ai cumparat " + produs);

        }
    }
}
