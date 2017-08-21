package FileAddDirectory;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileOverview {
    public static void main(String[] args) {

        FileOverview.createDirectoryAndFile();
       /* 1. Zapytac o nazwe katalogu
          2. Stworzyc katalog o podanej nazwie
          3. Zapytac o notatke
          4. Dopisac date i zapisac notatke w pliku o nazwie notatka.txt
          */
    }

    public static void createDirectoryAndFile() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj nazwe katalogu");
        String directoryName = sc.nextLine();
        File file = new File(directoryName);
        if (file.exists()) {
            System.out.println("Katalog istnieje");
        } else {
            System.out.println(file.mkdir() ? "Utworzono katatalog" : "Nie udalo sie utworzyc katalogu");
        }

            System.out.println("Podaj notatke");
            String note = sc.nextLine();

            BufferedWriter bufferedWriter = null;
            FileWriter fileWriter = null;
            try{
                fileWriter = new FileWriter(directoryName+ "\\plik.txt");
                bufferedWriter = new BufferedWriter(fileWriter);
                bufferedWriter.write(note);
                bufferedWriter.flush();
            }catch (IOException e){
                e.printStackTrace();
            }
            finally {
                if(bufferedWriter != null){
                    try{
                        bufferedWriter.close();
                    }catch(IOException e){
                        e.printStackTrace();
                    }
                }
                if(fileWriter != null){
                    try{
                        fileWriter.close();
                    }catch (IOException e){
                        try {
                            fileWriter.close();
                        } catch (IOException e1) {
                            e1.printStackTrace();
                        }
                    }
                }
            }
            //Gorsza wersja
            /*boolean mkdir = file.mkdir();
            if (mkdir) {
                System.out.println("Utworzono katalog");

            } else {
                System.out.println("Nie udalo sie utworzyc katalogu");
            }*/
        }
        public static void createFileWithResources(String path){
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path))){
            bufferedWriter.write("wiadomosc");
        }catch(IOException e){
            e.printStackTrace();
        }

        }
        public static void  createNote(){
            createDirectory();
        }

    private static String createDirectory() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj nazwe katalogu");
        String directoryName = sc.nextLine();
        File file = new File(directoryName);
        if (file.exists()) {
            System.out.println("Katalog istnieje");
        } else {
            System.out.println(file.mkdir() ? "Utworzono katatalog" : "Nie udalo sie utworzyc katalogu");
        }
    return directoryName;
        }
}

