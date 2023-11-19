package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner ( System.in );
        cancion song = new cancion("The Scientist", "Coldplay", "A Rush of Blood to the head", 2002);

        Leyenda leyenda = song.getLeyenda();

        System.out.println(leyenda.getTexto ());


        song.setNumeroDeReproducciones(1001);

        leyenda = song.getLeyenda();

        System.out.println(leyenda.getTexto ());


        song.setNumeroDeReproducciones(50001);
        song.setNumeroDeLikes (20001);

        leyenda = song.getLeyenda();

        System.out.println(leyenda.getTexto ());
}}