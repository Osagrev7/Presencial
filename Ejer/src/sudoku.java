import java.util.Random;

import static java.util.Arrays.sort;

public class sudoku {


    static int[][] numeros = new int[9][9];
    static Random rd = new Random();



    public static void main(String[] args) {




        //mostarSudoku();

        sudoku(numeros,0,0);
    }


    public static void mostarSudoku(){
        for(int i = 0 ; i < numeros.length; i++){
            for(int j = 0 ; j < numeros[i].length; j++){
                System.out.print(numeros[i][j] + " ");

                if ((j + 1) % 3 == 0){
                    System.out.print("|");
                }
            }
            System.out.println();

            if ((i + 1) % 3 == 0){
                System.out.println("---------------------");
            }
        }
    }

    public static boolean sudoku(int[][] a, int fila, int columna){

        if(fila == 9){
            return true;
        }

        if(columna == 9){
            return sudoku(a, fila, 0 + 1);
        }

        int[] numeros = {1,2,3,4,5,6,7,8,9};
        int numero = rd.nextInt(9);


        //desordenar numeros
        for (int x = 8; x > 0; x--){
            int aux = numeros[x]; //posi aleatoria
            numeros[x] =  // posi de x
            aux = numeros[x]; //

        }

        for (int x = 0; x < 9; x++) {

            //System.out.println(numero[x]);
        }





        return false;
    }




}
