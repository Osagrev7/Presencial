package quizz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Jugador jugador = new Jugador("leo", 0,0,0);
        //Pregunta pregunta = new Pregunta("facil");

        jugador.sumarPuntos(sc);

        System.out.println(jugador.getPuntuacionTotal());
        //System.out.println(pregunta.getDificultad());


    }
}
