import Classes.Queue_array;


public class Object_Stack_Array {
    public static void main(String[] args) {
        System.out.println("Podaj wielkosc tablicy");
        Queue_array start = new Queue_array();
        System.out.println("Podaj 5 elementow: ");
        start.add(5);
        start.add(7);
        start.add(9);
        start.add(4);
        start.add(6);
        System.out.println("Wyswietli teraz pierwszy element");
        System.out.println(start.get());
        System.out.println("Wyswietli teraz drugi element");
        System.out.println(start.get());
        System.out.println("Wyswietli teraz trzeci element");
        System.out.println(start.get());


    }
}
