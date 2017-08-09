import java.util.Arrays;
// DOKONCZ W DOMU TA KLASE

public class GraphGnk {
    int n = 4;
    int h = n * (n - 1) / 2;


    private static Edge[] generateEdgeArray(int n, int h) {
        Edge[] result = new Edge[h];
        int index = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                Edge element = new Edge;
                element.a = i;
                element.b = j;
                result[index] = element;
                h--;
                index++;


            }

        }

        return result;

    }
    public static void main(String[] args) {

        boolean[][] result = generateEdgeArray(4, );
        for (int i = 0; i < result.length; i++) {
            System.out.println(Arrays.toString(result[i]));
        }
}
