import java.util.Scanner;

public class GestorNotas {

     static int[] notas;



    public static void main(String[] args) {

        appNotas();
    }

    public static void appNotas(){

        boolean salir = false;
        Scanner sc = new Scanner(System.in);

        while (!salir){

            int menu = menu(sc);
            salir = opciones(sc, menu);
        }
    }

    public static int menu(Scanner sc){
        System.out.println("""
                menu
                1.Introducir Notas
                2.Mostrar notas
                4.Nota Max
                5.Nota Min 
                """);

        return Integer.parseInt(sc.nextLine());
    }

    public static boolean opciones(Scanner sc, int menu){
        boolean salir = false;

        switch (menu){
            case 1 -> notasI(sc);
            case 2 -> mostrarNotas();
            case 4 -> notasMax();
            case 5 -> notaMin();
            case 7 -> salir = true;
        }

       return salir;
    }

    public static void notasI(Scanner sc){

        int [] notasTemp = new int[3];

        for (int i = 0; i < notasTemp.length; i++){
            System.out.print("Introducir Notas = ");
            notasTemp[i] = Integer.parseInt(sc.nextLine());
        }

        notas = notasTemp;

    }

    public static void mostrarNotas(){

        for(int nota: notas){
            System.out.println(nota);
        }
    }


    public static void notasMax(){

        for (int i = 0; i < notas.length; i++){
            for (int j = 0; j < notas.length -1 -i; j++){

                if (notas[j] > notas[j +1 ]){
                    int temp = notas[j];
                    notas[j] = notas[j + 1];
                    notas[j +1] = temp;
                }
            }
        }

        System.out.println("nota Max = " + notas[2]);

    }

    public static void notaMin(){

        System.out.println("nota Min = " + notas[0]);

    }









}


