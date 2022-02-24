package ro.itschool.Incapsulation;

public class Main {
    public static void main(String[] args) {
        //Un obiect calculatoir cu 4 procesoare, 4 gb Ramm si 256 GB HDD.

        Pc myPc = new Pc();
//        myPc.numarProcesoare = 4;
//        myPc.memorieRam = 4;
//        myPc.capacitateHDD = 256; nu le mai putem accesa fiind private

        //atunci trebuie sa apelam metoda...

        myPc.setNumarProcesoare(4);
        myPc.setMemorieRam(4);
        myPc.setCapacitateHDD(256);

        //metoda se apeleaza ca o metoda obisnuita numeClasa.setNumeMetdoa + (parametru)

        System.out.println("Pcul meu are " + myPc.getNumarProcesoare() + " nr. de procesoare" );
        System.out.println("Pcul meu are " + myPc.getCapacitateHDD() + " capacitate HDD" );
        System.out.println("Pcul meu are " + myPc.getMemorieRam() + " memorie Ram" );
    }
}
