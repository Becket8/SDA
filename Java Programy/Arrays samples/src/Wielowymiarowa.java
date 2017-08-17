import java.util.Scanner;

public class Wielowymiarowa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int [] [] macierz = new int[x] [y];
        System.out.println("Podaj elementy macierzy: ");
        for(int i=0;i<macierz.length;i++){
            for(int j =0;j<macierz[i].length;j++) {
                macierz[i][j] = sc.nextInt();
            }
            }
            for(int n=0;n<3;n++){
                for (int m =0; m<3;m++){
                    System.out.print(macierz[n][m]+ " ");
                }

                System.out.println();
            }

            }

        }



