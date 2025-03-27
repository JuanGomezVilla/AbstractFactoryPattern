package com.juangv;

public class DaemonGameTest {
    public static void main(String[] args) {
        //Obtenemos la instancia del juego
        GameController game = GameController.getInstance();

        //Ejecutamos el juego
        game.play();
    }
}