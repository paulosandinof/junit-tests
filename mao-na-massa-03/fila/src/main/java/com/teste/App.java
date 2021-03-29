package com.teste;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Fila fila = new Fila(5);

        System.out.println(fila.tamanho());
        System.out.println(fila.getTam());
        System.out.println(fila.getFim());

        fila.insereNaFila("Paulo");
        fila.insereNaFila("Sandino");
        fila.insereNaFila("Rivelino");
        fila.insereNaFila("Ferreira");
        fila.insereNaFila("Guilherme");

        System.out.println(fila.tamanho());
        System.out.println(fila.getTam());
        System.out.println(fila.getFim());

        fila.removeDaFila();
        fila.removeDaFila();
        fila.removeDaFila();
        fila.removeDaFila();
        fila.removeDaFila();
        fila.removeDaFila();

        System.out.println( "Hello World!" );
    }
}
