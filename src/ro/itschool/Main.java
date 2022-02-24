package ro.itschool;

public class Main {

    public static void main(String[] args) {
//        House casaMea = new House("Mane's house");
//        casaMea.color = "Verde";
//        casaMea.doorsNumber = 10;
//
//        System.out.println("Metri patrati: " + casaMea.meters);
//
//        House casaVecinului = new House("Gheorghe's house");
//        casaVecinului.color = " Albastru";
//        casaVecinului.doorsNumber = 12;

        User marius = new User("Rasbici", "Marius", 27);
        User vasile = new User("Vasile","Gheorghe", 24);
        User mihai = new User("Ionescu","Mihai");

        System.out.println("Varsta lui Mihai este " + mihai.age);
        User anonim = new User();
        System.out.println("Nume user: " + anonim.lastName + " " + anonim.firstName);
    }
}
