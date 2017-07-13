import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wpisz napis:");
        String[] napis = new String[30];
        String wynik = "";
        if(napis[napis.length-1] <= 29){
            for(int i = 0; i>napis[napis.length-1];i--){
            char litera = napis[i];
            napis[i]= litera;
            if(napis%2=0){
                System.out.println("Palindrom parzysty");
            }else{
                System.out.println("Palindrom nieparzysty");
            }
            }
            System.out.println(wynik);


        }else{
            System.out.println("Podany napis jest za dlugi");
        }
    }
}
