package org.example;

import lombok.Getter;
import lombok.Setter;

import javax.swing.*;

public class Leyenda {

    @Getter @Setter
    private Icon icono;
    @Getter @Setter
    private String texto;

    public Leyenda(Icon icono, String texto) {
        this.icono = icono;
        this.texto = texto;
    }
}