import java.util.Scanner;

public class Zamiana_liter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wpisz napis:");
        String napis = sc.nextLine();
        if(napis.length() <= 30){
            System.out.println("Wybierz żądaną operacje: " + "\n" + "1.Zamiana malych liter na duze" + "\n" + "2.Zamiana dużych liter na male" + "\n" + "1.Zamiana malych liter na duze i duzych na male");
            int operacja = sc.nextInt();
            String wynik ="";
            switch(operacja){
                case 1:{
                    for(int i = 0;i<napis.length();i++){
                        char znak = napis.charAt(i);
                        if(znak>=97 && znak<=122){
                            znak -= 32;

                    }
                    wynik += znak;

                    }
                    System.out.println(wynik);
                    break;
                }
                case 2:{
                    for(int i = 0;i<napis.length();i++){
                        char znak = napis.charAt(i);
                        if(znak>=65 && znak<=90){
                            znak += 32;

                        }
                        wynik += znak;

                    }
                    System.out.println(wynik);
                    break;

            }
                case 3:{
                    for(int i = 0;i<napis.length();i++){
                        char znak = napis.charAt(i);
                        if(znak>=97 && znak<=122){
                            znak -= 32;

                        }else if(znak>=65 && znak<=90){
                            znak += 32;
                        }else{

                        }
                        wynik += znak;
                          }
                    System.out.println(wynik);
                    break;
                    }


                    }



        }else{
            System.out.println("Podany napis jest za długi, wprowadź go ponownie");
        }
    }
}
