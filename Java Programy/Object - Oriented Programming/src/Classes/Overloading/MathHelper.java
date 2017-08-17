package Classes.Overloading;

public class MathHelper {
    private int a;
    private int b;
    public int summary (int a, int b){
        int c = a+b;
        return c;
    }
    public float summary (float a, float b) {
        float c = a + b;
        return c;
    }
    public double summary (double a, double b) {
        double c = a + b;
        return c;
    }
}
