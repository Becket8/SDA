public class GraphGnk {

    private static Edge[] generateGnk(int n, int k) {
        int h = n * (n - 1) / 2;
        Edge[] result = generateEdgeArray(n);
        if (k <= h) {
            while (k > 0) {
                int r = (int) Math.floor(Math.random() * h);

                Edge temp = result[r];
                result[r] = result[h - 1];
                result[h - 1] = temp;
                h--;
                k--;
            }
        }
        return result;
    }


    private static Edge[] generateEdgeArray(int n) {
        int h = n * (n - 1) / 2;
        Edge[] result = new Edge[h];
        int index = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                Edge newEdge = new Edge();
                newEdge.a = i;
                newEdge.b = j;
                result[index] = newEdge;
                index++;
            }
        }

        return result;
    }


    private static boolean[][] transformEtoA(Edge[] struct, int k, int n) {
        boolean[][] result = new boolean[n][n];
        int h = struct.length;

        for (int i = h - 1; i > h - 1 - k; i--) {
            result[struct[i].a][struct[i].b] = true;
            result[struct[i].b][struct[i].a] = true;
        }

        return result;
    }

    public static void main(String[] args) {

       /* TEST FUNKCJA
       int n = 4;
        Edge[] test;

        test = generateEdgeArray(n);
        for (Edge e: test) {
            System.out.println(e.toString());
        }*/
        int n = 4;
        int k = 6;



        Edge[] resultGnk = generateGnk(4, 3);
        for (int i = resultGnk.length - 1; i >= resultGnk.length - k; i--) {
            System.out.println(resultGnk[i].toString());

            // W domu ogarnij zeby rozszerzalo nam klase i dobrze porownywalo

        }
    }
}