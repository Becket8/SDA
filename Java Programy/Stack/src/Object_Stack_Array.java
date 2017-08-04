import Classes.Queue_array;

import java.util.Scanner;


public class Object_Stack_Array {
    public static void main(String[] args) {
        System.out.println("Podaj wielkosc tablicy");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue_array start = new Queue_array();
        start.setSize(n);
        start.setQueue(n);
        for(int i =0;i< n;i++){
            System.out.println("Podaj liczby do tablicy");
            int elemnet = sc.nextInt();
            elemnet = start.queue[i];

        }

        System.out.println("Wyswietli teraz pierwszy element");
        System.out.println(start.get());
        System.out.println("Wyswietli teraz drugi element");
        System.out.println(start.get());
        System.out.println("Wyswietli teraz trzeci element");
        System.out.println(start.get());


    }
}
