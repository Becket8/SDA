import java.util.Scanner;


public class Kalkulator {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);

            long liczba1;
            long liczba2;
            int dzialanie;
            do
            {
                do
                {
                    System.out.println("Wprowadz liczbe 1: ");
                    liczba1 = skaner.nextLong();

                }while (liczba1 !=0);
                do
                {
                    System.out.println("Wprowadz liczbe 2: ");
                    liczba2 = skaner.nextLong();

                }while (liczba2 !=0);
                do
                {
                    System.out.println("Wybierz jedno z dzialan: " + "\n" + "[1] Dodawanie " + "\n" + "[2] Odejmowanie " + "\n" + "[3] Mnozenie " + "\n" + "[4] Dzielenie " + "\n" + "[5] Rezygnuj ");
                    System.out.println("Wybrano operacje: ");
                    dzialanie = skaner.nextInt();

                }while (dzialanie < 6);
                switch (dzialanie)
                {
                    case 1:

                        System.out.println("Wynik to:" + "" + liczba1 + liczba2);
                        break;
                    case 2:
                        System.out.println("Wynik to: "+ "" + (liczba1 - liczba2));
                        break;
                    case 3:
                        System.out.println("Wynik to: "+ "" + (liczba1 * liczba2));
                        break;
                    case 4:
                        if(liczba2 != 0){
                        System.out.println("Wynik to: "+ "" + (liczba1 / liczba2));}
                        else
                        System.out.println("Nie mozna dzielic przez 0");
                        break;
                    case 5:
                        System.out.println("Dziekujemy za skorzystanie z naszego kalkulatora");
                        break;
                    default:
                        System.out.println("Zadna operacja nie zostala wybrana ");
                }
            }while(true);




    }
}

