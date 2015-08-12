public class Main {

    //1
    static int nossoarray[][];
    static int resultado[][];
    static int[][] matriz23 = {{1,2},{3,4,5}};

    public static void main(String[] args) {
        criaArray();
        printaLinha();
        System.out.println("\n");
        printaColuna();
        System.out.println("\n");

        somaMatrizes(nossoarray, nossoarray);
        imprimeMatriz(resultado);
        System.out.println("\n");

        imprimeMatriz(matriz23);
        System.out.println("\n");

        imprimeMatriz(somaMatrizes(matriz23,matriz23));

    }

    /*/Cria uma matriz 5x6 e inicializa cada posição com o valor
    da soma da coordenada da linha com a coordenada dacoluna
    */
    public static void criaArray() {
        nossoarray = new int[5][6];
        for(int i = 0; i < nossoarray.length; i++) {
            for(int j = 0; j < nossoarray[0].length; j++) {
                nossoarray[i][j] = i + j;
            }
        }
    }

    //Imprime todas linhas de uma matriz
    public static void printaLinha() {
        for (int i = 0; i < nossoarray.length; i++) {
            for (int j = 0; j < nossoarray[0].length; j++) {
                System.out.print(nossoarray[i][j]);
           }
            System.out.print("\n");
        }
    }

    //Imprime todas as colunas de uma matriz
    public static void printaColuna() {
        for (int i = 0; i < nossoarray[0].length; i++) {
            for (int j = 0; j < nossoarray.length; j++) {
                System.out.print(nossoarray[j][i]);
            }
            System.out.print("\n");
        }
    }

    //Imprime a matriz recebida
    public static void imprimeMatriz(int[][] matriz){
        System.out.println("Matriz: ");
        for (int i = 0; i < matriz.length; i++){
            System.out.print("|");
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(" "+matriz[i][j]+" ");
            }
            System.out.print("|");
            System.out.println();
        }
    }


    /*
    2 - Implemente um método que receba duas matrizes e retorna o resultado da sua soma
    (lembre-se das restrições para se somar matrizes).
    */
    public static int[][] somaMatrizes(int[][] m1, int[][] m2) {
        if(m1.length != m2.length || m1[0].length != m2[0].length) {
            System.out.println("As matrizes não são de mesma ordem, não é possível realizar a soma.");
        } else {
            resultado = new int [m1.length][m2[0].length];
            for(int i = 0; i < m1.length; i++) {
                for(int j = 0; j < m2[0].length; j++){
                    resultado[i][j] = m1[i][j] + m2[i][j];
                }
            }
       }
        return resultado;
    }

    // 3 - Método que recebe uma matriz e retorna a matriz transposta
    public int[][] transpoeMatriz(int[][] matriz){
        int[][] transposta = new int[matriz.length][matriz.length];
        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j < matriz.length; j++) {
                transposta[i][j] = matriz[j][i];
            }
        }
        return transposta;
    }


}
