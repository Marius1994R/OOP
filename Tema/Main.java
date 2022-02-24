package ro.itschool.Tema;

public class Main {
    public static void main(String[] args) {

        Cerc circle = new Cerc();
        circle.setRaza(6);
        System.out.println(area(circle.getRaza()));
    }
    public static double area(double raza){
        double pi = 3.14;
        double area = pi * Math.pow(raza, 2);
        return area;
    }

}
