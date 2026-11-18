package quizz;

import java.util.Scanner;

public class Jugador {

    private String nombre;
    private int puntuacionTotal;
    private int partidasJugadas;
    private int partidasGanadas;

    //constructores

    public Jugador(String nombre, int puntuacionTotal,
                   int partidasJugadas, int partidasGanadas){

        this.nombre = nombre;
        this.puntuacionTotal = puntuacionTotal;
        this.partidasJugadas = partidasJugadas;
        this.partidasGanadas = partidasGanadas;

    }

    //getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntuacionTotal() {
        return puntuacionTotal;
    }

    public void setPuntuacionTotal(int puntuacionTotal) {
        this.puntuacionTotal = puntuacionTotal;
    }

    public int getPartidasJugadas() {
        return partidasJugadas;
    }

    public void setPartidasJugadas(int partidasJugadas) {
        this.partidasJugadas = partidasJugadas;
    }

    public int getPartidasGanadas() {
        return partidasGanadas;
    }

    public void setPartidasGanadas(int partidasGanadas) {
        this.partidasGanadas = partidasGanadas;
    }

    public Pregunta sumarPuntos(Scanner sc){

        // dificultad y respuesta correcta

        System.out.print("Introduce Dificultad = ");
        Pregunta dificultad = new Pregunta(sc.nextLine());
        Pregunta respuestCorrecta = new Pregunta(sc.nextInt());



        String aux = dificultad.getDificultad();

        if (aux.equals("facil")){
            if (respuestCorrecta)
            puntuacionTotal += 10;
        }else if (aux.equals("medio")){
            puntuacionTotal += 20;
        }else if (aux.equals("dificil")){
            puntuacionTotal += 20;
        }

        return dificultad;
    }

    private void registrarPartida(Scanner sc){

        System.out.println("Introduce tu nombre");
        nombre = sc.nextLine();


    }

    private void mostratInformacion(){

        System.out.println("nombre = " + nombre);
        System.out.println("puntuacionTotal = " + puntuacionTotal);

        //los otros
    }


}
