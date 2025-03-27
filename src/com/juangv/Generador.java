package com.juangv;

import java.util.Random;

public class Generador {
    /**
     * Método que devuelve un booleano si hay que realizar una acción
     * en base a una probabilidad
     * @param probabilidad double, probabilidad entre 0 y 1 (ej: 45% -> 0.45)
     * @return Verdadero si está por debajo de la probabilidad
     */
    public static boolean generarPorDebajo(double probabilidad){
        //Devuelve si un número entre 0 y 1 decimal es menor que la probabilidad dada
        return new Random().nextDouble() < probabilidad;
    }
}