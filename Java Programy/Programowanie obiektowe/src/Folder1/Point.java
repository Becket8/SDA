package Folder1;

public class Point {
    public float x;
    public float y;

    public Point() {

    }

    public double DistanceFromOrigin() {
        return Math.sqrt(x * x + y * y);

    }
}