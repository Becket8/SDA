import java.util.Scanner;

public class Erastotenes_sieve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj górny zakres");
        int Top = sc.nextInt();
        int Root = (int) Math.floor(Math.sqrt(Top));

        int[] arr = new int[Top - 1];
        for (int i = 1; i < Top; i++) {
            arr[i - 1] = i + 1;

        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            } else {
                System.out.println("dalej");
                continue;

            }
        }

    }
}

