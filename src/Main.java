public class Main {

    static int nossoarray[][];

    public static void main(String[] args) {
        criaArray();
        printaLinha();
        System.out.println("\n");
        printaColuna();
    }

    public static void criaArray() {
        nossoarray = new int[5][6];
        for(int i = 0; i < nossoarray.length; i++) {
            for(int j = 0; j < nossoarray[0].length; j++) {
                nossoarray[i][j] = i + j;
            }
        }
    }

    public static void printaLinha() {
        for (int i = 0; i < nossoarray.length; i++) {
            for (int j = 0; j < nossoarray[0].length; j++) {
                System.out.print(nossoarray[i][j]);
           }
            System.out.print("\n");
        }
    }

    public static void printaColuna() {
        for (int i = 0; i < nossoarray[0].length; i++) {
            for (int j = 0; j < nossoarray.length; j++) {
                System.out.print(nossoarray[j][i]);
            }
            System.out.print("\n");
        }
    }

    public static void somaMatrizes(int[][] m1, int[][] m2) {
        if(m1.length != m2.length || m1[0].length != m2[0].length) {
            System.out.println("Tamanhos diferentes");
        } else {
            int [] [] resultado = new int [m1.length][m2[0].length];
            for(int i = 0; i < m1.length; i++) {
                for(int j = 0; j < m2[0].length; j++){
                    resultado[i][j] = m1[i][j] + m2[i][j];
                }

            }
        }
        System.out.println();

    }
}
