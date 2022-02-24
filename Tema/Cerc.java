package ro.itschool.Tema;

public class Cerc {
    private double raza;

    public void setRaza(double raza) {
        if (raza > 0) {
            this.raza = raza;
            System.out.println("The radius is: " + raza);
        } else {
            System.out.println("Radius can't be a negative number.");
        }
    }
    public double getRaza(){
        return raza;
    }
}