package ro.itschool.Incapsulation;

public class Pc {
    private int numarProcesoare;
    private int memorieRam;
    private int capacitateHDD;


    //set-er - putem da conditii pentru componentele unei metode.

    public void setNumarProcesoare(int nrProcesoare) {
        if (nrProcesoare > 0) {
            numarProcesoare = nrProcesoare;
        }
    }
    //Incapsularea = atribute private dar care primesc anumite conditii
    // pentru a putea fi utilizate de alti useri.

    public void setMemorieRam(int memorieRam) {
        this.memorieRam = memorieRam; // this. - inseamna ca variabile de sus
        // cea private este cea care ia valoarea variabilei care intra.
    }

    public void setCapacitateHDD(int capacitateHDD) {
        this.capacitateHDD = capacitateHDD;
    }

    public int getMemorieRam(){
        return memorieRam;
        // o metdoda care ne returneaza tipul variabilei
    }
    public int getNumarProcesoare(){
        return numarProcesoare;
    }
    public int getCapacitateHDD(){
        return capacitateHDD;
    }
}




