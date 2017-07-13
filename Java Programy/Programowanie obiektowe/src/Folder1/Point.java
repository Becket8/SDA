package Folder1;

public class Point {
    public double x;
    public double y;
    public double wynik;
    public Point(){

    }
    public double DistanceFromOrigin(double z){
        z= Math.sqrt(x*x+y*y);
        wynik = z;

        System.out.println("Odleglosc to: "+ this.wynik);
        return wynik;
    }

}