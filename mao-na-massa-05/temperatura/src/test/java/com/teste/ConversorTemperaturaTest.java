package com.teste;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ConversorTemperaturaTest {

    private double entradaCelsius;
    private double esperadoCelsius;
    private double entradaFahrenheit;
    private double esperadoFahrenheit;

    public ConversorTemperaturaTest(double entradaCelsius, double esperadoCelsius, double entradaFarenheit,
            double esperadoFarenheit) {
        this.entradaCelsius = entradaCelsius;
        this.esperadoCelsius = esperadoCelsius;
        this.entradaFahrenheit = entradaFarenheit;
        this.esperadoFahrenheit = esperadoFarenheit;
    }

    @Parameters
    public static Object[][] data() {
        return new Object[][] { 
            {-500, 104, 104, 40}
        };
    }

    @Test
    public void testConverterCelsiusParaFarenheit() {
        try {
            Celsius celsius = new Celsius();
            ConversorTemperatura conversorTemperatura = new ConversorTemperatura();
            
            celsius.setValue(entradaCelsius);
            Temperatura resultado = conversorTemperatura.converte(celsius);

            assertEquals(esperadoCelsius, resultado.getValue(), 0.001);
        } catch (Exception e) {
            assertTrue(e instanceof TempException);
        }
    }

    @Test
    public void testConverterFarenheitParaCelsius() {
        try {
            Fahrenheit fahrenheit = new Fahrenheit();
            ConversorTemperatura conversorTemperatura = new ConversorTemperatura();
            
            fahrenheit.setValue(entradaFahrenheit);
            Temperatura resultado = conversorTemperatura.converte(fahrenheit);

            assertEquals(esperadoFahrenheit, resultado.getValue(), 0.001);
        } catch (Exception e) {
            assertTrue(e instanceof TempException);
        }
    }
}
