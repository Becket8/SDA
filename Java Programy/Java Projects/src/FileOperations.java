import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileOperations {

    private static final String PATH_TO_FILE = "C:\\Users\\RENT\\Desktop\\SDA\\Java Programy\\Java Projects\\src\\txt.txt";

    public static String readFile(String path) throws InterruptedException {


        BufferedReader bufferedReader = null;
        String result = null;
        String line = null;

        try {
            bufferedReader = new BufferedReader(new FileReader(path));
            while ((line = bufferedReader.readLine()) != null) {
                result+= line;
                Thread.sleep(100);
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

    public static String readFileWithStringBuilder(String path) throws InterruptedException {


        BufferedReader bufferedReader = null;
        StringBuilder stringBuilder = new StringBuilder();
        String line = null;

        try {
            bufferedReader = new BufferedReader(new FileReader(path));
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line);
                Thread.sleep(100);
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

        return stringBuilder.toString();

    }

    public static void main(String[] args) throws InterruptedException {


        String calyPlik = FileOperations.readFileWithStringBuilder(PATH_TO_FILE);
        System.out.println(calyPlik);
    }
}
