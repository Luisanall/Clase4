package org.example;

import lombok.Getter;

import javax.swing.*;
import java.awt.*;

public enum Popularidad implements Icon {

    NORMAL(1000, "🎵"),
    EN_AUMENTO(10000, "🚀"),
    TENDENCIA(50000, "🔥");
    @Getter
    private final int umbral;
    @Getter
    private final String icono;

     Popularidad(int umbral, String icono) {
        this.umbral = umbral;
        this.icono = icono;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {

    }

    @Override
    public int getIconWidth() {
        return 0;
    }

    @Override
    public int getIconHeight() {
        return 0;
    }
}