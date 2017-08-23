import java.util.Scanner;

public class Tablica_float_suma {
    public static float SumujTablice(float[] tablica){
        float sum = 0;
        for(int i=0;i<tablica.length; i++ ){
            Scanner sc = new Scanner(System.in);
            System.out.println("Podaj " +(i+1)+ " element");
            float element = sc.nextFloat();
            tablica[i]= element;
        sum+= tablica[i];
    }
    return sum;
}
    public static float[] InitializeArray(float[] array){
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj elementy tablicy: ");

        for(int i=0;i>array.length;i++){
            System.out.println("Podaj "+(i+1+ " element: "));
            array[i]=sc.nextFloat();


        }
        return array;

    }
    public static void main(String[] args) {
        System.out.println("Podaj wielkosc tablicy zeby ja zsumowal");
        Scanner sc = new Scanner(System.in);
        int wielkosc = sc.nextInt();
        float[] tablica = new float [wielkosc];
        System.out.println("Suma to: " + SumujTablice(tablica));

    }
}
