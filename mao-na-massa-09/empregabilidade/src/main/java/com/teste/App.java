package com.teste;

public class App {
    private final int NAO_EMPREGAR = 0;
    private final int EMPREGAR_TEMPO_INTEGRAL = 1;
    private final int EMPREGAR_TEMPO_PARCIAL = 2;

    public int avaliaEmpregabilidade(int idade, boolean cursoSuperior) throws IdadeInvalidaException {

        int status = NAO_EMPREGAR;

        if (idade < 0) {
            throw new IdadeInvalidaException();
        }

        if ((idade > 0 && idade < 17) || (idade > 60 && cursoSuperior == false)) {

            status = NAO_EMPREGAR;

        }

        if ((idade >= 18 && idade < 60) && cursoSuperior == true) {

            status = EMPREGAR_TEMPO_INTEGRAL;

        }

        if (idade >= 60 && cursoSuperior == true) {

            status = EMPREGAR_TEMPO_PARCIAL;

        }

        int i = idade;

        while (i > 0) {
            System.out.println("...");
            i--;
        }

        return status;

    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
