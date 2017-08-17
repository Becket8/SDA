package Classes.Inheritance;

public class Point_2D {
    protected double x;
    protected double y;

    public Point_2D(){
        this.x = 0;
        this.y = 0;

    }
    public Point_2D(double x, double y){
        this.x = x;
        this.y = y;

    }
    public void describePoints(){
        System.out.println("Współrzędne to: " + x +" " + y);
    }

}
