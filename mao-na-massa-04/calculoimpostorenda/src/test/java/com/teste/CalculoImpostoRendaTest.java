package com.teste;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CalculoImpostoRendaTest {
    double entrada;
    double esperado;

    public CalculoImpostoRendaTest(double entrada, double esperado) {
        this.entrada = entrada;
        this.esperado = esperado;
    }

    // @Parameters
    // public static Collection<Object[]> data() {
    //     return Arrays.asList(new Object[][] { 
    //         { 1200, 0 }, 
    //         { 1201, 120.1 }, 
    //         { 5000, 500 }, 
    //         { 5001, 750.15 },
    //         { 10000, 1500 },
    //         { 10001, 2000.2 }
    //     });
    // }

    @Parameters
    public static Object[][] data() {
        return new Object[][] {
            { 1200.0, 0. }, 
            { 1201., 120.1 }, 
            { 5000., 500. }, 
            { 5001., 750.15 },
            { 10000., 1500. },
            { 10001., 2000.2 },
        };
    }


    @Test
    public void calculaImpostoTest() {
        double resultado = CalculoImpostoRenda.calculaImposto(entrada);
        assertEquals(esperado, resultado, 0.01);
    }
}
