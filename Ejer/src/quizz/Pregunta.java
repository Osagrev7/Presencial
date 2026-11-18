package quizz;

import java.util.Scanner;

public class Pregunta {

    private String enunciado;
    private String[] respuestas;
    private int respuestaCorrecta;
    private String categoria;
    private String dificultad;
    private String pista;

    //constructor vacio
    public Pregunta(String dificultad){
        this.dificultad = dificultad;

    }

    public Pregunta(int respuestaCorrecta){
        this.respuestaCorrecta = respuestaCorrecta;
    }

    public Pregunta(String enunciado, String categoria, int respuestaCorrecta) {

        this.enunciado = enunciado;
        this.categoria = categoria;
        this.respuestaCorrecta = respuestaCorrecta;


    }

    public String getEnunciado() {
        return this.enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public String[] getRespuestas() {
        return respuestas;
    }

    public void setRespuestas(String[] respuestas) {
        this.respuestas = respuestas;
    }

    public int getRespuestaCorrecta() {
        return respuestaCorrecta;
    }

    public void setRespuestaCorrecta(int respuestaCorrecta) {
        this.respuestaCorrecta = respuestaCorrecta;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDificultad() {
        return dificultad;
    }

    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }

    public String getPista() {
        return pista;
    }

    public void setPista(String pista) {
        this.pista = pista;
    }

    private void comprobarRespuesta(String[] respuestas, int respuestaCorrecta, Scanner sc) {

        for (int i = 0; i > 1; i++ ){ // solo repite una sola vez

            respuestas[i] = sc.nextLine(); // usuario pone respuesta 2
            int aux = Integer.parseInt(respuestas[i]); // lo pasamos a un int

            if (aux == respuestaCorrecta){ //aux es igual a repuesta correcta true

               System.out.println("Respuesta correcta" + respuestaCorrecta);

           }
        }

    }

    private void mostrarPretunga(){

        System.out.println("enunciado = " + enunciado);
    }

    private void mostrarPista(){
        System.out.println("pista = " + pista);
    }


}
