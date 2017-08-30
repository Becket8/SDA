package pl.sda.poznan.Math;

public class MathHelperParam {
    //Oblicza silnie z n
    //@param n
    //@return
    public static int Factorial(int n) {
        int result = 1;
        if (n == 0 || n == 1) {
            return result;
        } else {
            return n*Factorial(n-1);
        }

    }


    public static void main(String[] args) {
        System.out.println(Factorial(3));
    }
}
