package org.example;

import lombok.Getter;
import lombok.Setter;

import javax.swing.*;

import static org.example.Popularidad.*;

public class cancion {
        @Getter @Setter
        private static String titulo;
        @Getter @Setter
        private static String artista;
        @Getter @Setter
        private static String album;
        @Getter @Setter
        private static int year;
        @Getter @Setter
        private static Popularidad popularidad;
        @Getter @Setter
        private int numeroDeReproducciones;
        @Getter @Setter
        private int numeroDeLikes;
        @Getter @Setter
        private int numeroDeDislikes;

        public cancion(String titulo, String artista, String album, int year) {
            this.titulo = titulo;
            this.artista = artista;
            this.album = album;
            this.year = year;
            this.popularidad = NORMAL;
            this.numeroDeReproducciones = 0;
            this.numeroDeLikes = 0;
            this.numeroDeDislikes = 0;
        }
    public static Leyenda getLeyenda() {
      switch ( popularidad){
            case NORMAL:
                return new Leyenda ( NORMAL, String.format ( "%s - %s - %s", artista, album, titulo ) );
            case EN_AUMENTO:
                return new Leyenda ( EN_AUMENTO, String.format ( "%s - %s (%s - %d)", artista, titulo, album, year ) );
            case TENDENCIA:
                return new Leyenda ( TENDENCIA, String.format ( "%s - %s (%s - %d)", titulo, artista, album, year ) );
            default:
                throw new IllegalStateException ( "Popularidad no válida" );
        }
    }}