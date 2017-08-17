import java.util.Scanner;

/**
 * Created by RENT on 2017-07-05.
 */
public class BMI_else_if {
    public static void main(String[] args){
        Scanner skaner = new Scanner(System.in);
        System.out.println("Podaj swoja wage: ");
        float waga = skaner.nextFloat();
        System.out.println("Podaj swoj wzrost: ");
        float wzrost = skaner.nextFloat();
        float bmi = waga/(wzrost*wzrost);
        System.out.println(bmi);

        if(bmi < 18.5) {
            System.out.println("Masz niedowage");
        }else if((bmi >= 18.5)&& (bmi < 25)){
                System.out.println("Waga ok");
        }else{
                System.out.println("Nadwaga");
            }

            }

    }

