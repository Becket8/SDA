import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

import java.util.Arrays;

public class GraphGnp {

    public static boolean[][] generateGNP(int n, double p) {
        boolean[][] result = new boolean[n][n];
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (Math.random() < p) {
                    result[i][j] = true;
                    result[j][i] = true;

                }

            }
            result[i][i] = true;
        }
        result[n - 1][n - 1] = true;
        return result;
    }


    public static void main(String[] args) {

        boolean[][] result = generateGNP(4, 0.5);
        for (int i = 0; i < result.length; i++) {
            System.out.println(Arrays.toString(result[i]));
        }


    }
}
