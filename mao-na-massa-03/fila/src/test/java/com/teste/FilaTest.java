package com.teste;

import org.junit.Test;
import static org.junit.Assert.*;

public class FilaTest {

    @Test
    public void testInserirNaFila() {
        Fila fila = new Fila(2);

        fila.insereNaFila("Paulo");
        fila.insereNaFila("Roberto");

        assertEquals(fila.tamanho(), 1);
    }

    @Test
    public void testRemoverDaFila() {
        Fila fila = new Fila(2);

        fila.insereNaFila("Paulo");
        fila.insereNaFila("Roberto");

        Object pessoa1 = fila.removeDaFila();
        Object pessoa2 = fila.removeDaFila();

        assertEquals(pessoa1, "Paulo");
        assertEquals(pessoa2, "Roberto");
    }

    @Test(expected = FilaCheiaException.class)
    public void testInserirNaFilaCheia() {
        Fila fila = new Fila(2);

        fila.insereNaFila("Paulo");
        fila.insereNaFila("Roberto");
        fila.insereNaFila("Marcos");
    }

    @Test(expected = FilaVaziaException.class)
    public void testRemoverDaFilaVazia() {
        Fila fila = new Fila(2);

        fila.insereNaFila("Paulo");
        fila.insereNaFila("Roberto");
        
        
        fila.removeDaFila();
        fila.removeDaFila();
        fila.removeDaFila();
    }
}