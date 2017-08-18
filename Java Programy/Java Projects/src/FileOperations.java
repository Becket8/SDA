import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileOperations {

    private static final String PATH_TO_FILE = "C:\\Users\\RENT\\Desktop\\SDA\\Java Programy\\Java Projects\\src\\txt.txt";
    
    public static String readFile(String path) {


        BufferedReader bufferedReader = null;
        String result = null;
        String line = null;

        try {
            bufferedReader = new BufferedReader(new FileReader(path));
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return result;

    }

    public static void main(String[] args) {


        FileOperations.readFile(PATH_TO_FILE);
    }
}
