package org.example;

import junit.framework.TestCase;
import org.junit.Test;

import javax.swing.*;

public class testCancion extends TestCase {
    @Test
    public void testLeyendaConIconoYTexto() {
        Leyenda leyenda = new Leyenda( Popularidad.NORMAL, "The Scientist - Coldplay - A Rush of Blood to the head");

        assertEquals(Popularidad.EN_AUMENTO, leyenda.getIcono());
        assertEquals("The Scientist - Coldplay - A Rush of Blood to the head", leyenda.getTexto());
    }

    @Test
    public void testLeyendaConIconoNull() {
        Leyenda leyenda = new Leyenda(null, "The Scientist - Coldplay - A Rush of Blood to the head");

        assertEquals(null, leyenda.getIcono());
        assertEquals("The Scientist - Coldplay - A Rush of Blood to the head", leyenda.getTexto());
    }

    @Test
    public void testLeyendaConTextoNull() {
        Leyenda leyenda = new Leyenda(Popularidad.NORMAL, null);

        assertEquals(Popularidad.NORMAL, leyenda.getIcono());
        assertEquals(null, leyenda.getTexto());
    }
}
