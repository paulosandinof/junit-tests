package com.teste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * Fazendo a análise de valores limites, temos os seguintes valores: - Para
 * valor < 1201, testamos 1200.5, 1201 e 1201.5 - Para 1201 <= valor <= 5000,
 * testamos 1200.5, 1201, 1201.5, 4999.5, 5000 e 5000.5 - Para 5001 <= valor <=
 * 10000, testamos 5000.5, 5001, 5001.5, 9999.5, 10000, 10000.5 - Para valor >
 * 10000, testamos 9999.5, 10000, 10000.5
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
            { 1200.5, 0. }, 
            { 1201., 120.1 }, 
            { 1201.5, 120.15 }, 
            { 4999.5,  499.95 },
            { 5000, 500 },
            { 5000.5, 750.075 }, // Este caso dá erro
            { 5001, 750.15 }, 
            { 5001.5, 750.225 }, 
            { 9999.5, 1499.925 }, 
            { 10000, 1500 }, 
            { 10000.5, 2000.1 } 
        };
    }

    @Test
    public void calculaImpostoTest() {
        double resultado = CalculoImpostoRenda.calculaImposto(entrada);
        System.out.println("Entrada: " + entrada + " Resultado: " + resultado + " Esperado: " + saida);
        assertEquals(saida, resultado, 0.01);
    }
}
