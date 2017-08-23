import java.util.Scanner;

public class Przyklad {
    public static void PrintMessege(String imie) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wiek tez by sie przydal :)");
        int wiek = sc.nextInt();
        System.out.println("Witaj "+imie+""+wiek);

    }
    public static void DescribeUser(String name, String surname, int age){
        System.out.println(name + "" + surname +""+ age);
    }
    public static void array(int[] array){
        for(int i :array){
            System.out.println(i);
        }
    }
    public static int AddElements(int a, int b){
        int suma = a+b;
        return suma;
    }
    public static int Factorial(int n){
        int result = 1;
        for(int i =1;i<=n;i++){
            result*=i;
        }
        return result;
    }
    public static int SumArray(int[] array){
        int sum = 0;
        for(int i=0;i<array.length;i++){
            sum+=array[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Imie podaj");
        int[] tablica = new int[]{1, 2 ,3};
        Scanner sc = new Scanner(System.in);
        String imie = sc.nextLine();
        System.out.println("Teraz pelne dane");
        String moje = sc.nextLine();
        String wszystkie = sc.nextLine();
        int dane = sc.nextInt();
        DescribeUser(moje,wszystkie,dane);
        PrintMessege(imie);
        array(tablica);
        int licz1 = 5;
        int licz2 = 15;
        int wynik = AddElements(licz1, licz2);
        System.out.println(wynik);
        int silnia = Factorial(2);
        System.out.println(silnia);
        System.out.println("Teraz sumujemy sobie tablice, podaj jej wartosci:");
        int wartosci[] = new int[9];
        int sumka = SumArray(wartosci);
        System.out.println("Suma to: " + sumka);



    }
}
