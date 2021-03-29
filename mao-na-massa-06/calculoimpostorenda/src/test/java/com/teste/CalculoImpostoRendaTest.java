package com.teste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * Verificando a interface do método, podemos definir as classes de equivalência como:
 * - valor = números positivo, números negativo, zero
 * 
 * Verificando a funcionalidade do método, podemos definir as classes de equivalência como:
 * - valor = valor < 1201, valor >= 1201 e valor <= 5000, valor >= 5001 e valor <= 10000, valor > 10000 
 */

@RunWith(Parameterized.class)
public class CalculoImpostoRendaTest {
    private double entrada;
    private double saida;

    public CalculoImpostoRendaTest(double entrada, double saida) {
        this.entrada = entrada;
        this.saida = saida;
    }

    @Parameters
    public static Object[][] data() {
        return new Object[][] {
            { 1200.5, 0. },     // Verificação da classe valor < 1201
            { 1201., 120.1 },   // Verificação da classe valor >= 1201 e valor <= 5000
            { 5001., 750.15 },  // Verificação da classe valor >= 5001 e valor <= 10000
            { 10001., 2000.2 }, // Verificação da classe valor > 10000
            { 5000.5, 750.075 } // Este é um caso que não está sendo coberto pelas classes de equivalência
        };
    }

    @Test
    public void calculaImpostoValorInterfaceTest() {
        double positivos = CalculoImpostoRenda.calculaImposto(5000);

        double negativos = CalculoImpostoRenda.calculaImposto(-500);

        double zero = CalculoImpostoRenda.calculaImposto(0);

        assertEquals(500, positivos, 0.01); // Verificação da classe dos números positivos

        assertEquals(0, negativos, 0.01);   // Verificação da classe dos números negativos

        assertEquals(0, zero, 0.01);        // Verificação da classe do número zero
    }

    @Test
    public void calculaImpostoFuncionalidadeTest() {
        double resultado = CalculoImpostoRenda.calculaImposto(entrada);
        assertEquals(saida, resultado, 0.01);
    }
}
