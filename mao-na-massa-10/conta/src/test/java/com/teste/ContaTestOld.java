package com.teste;

import static org.junit.Assert.*;

import org.junit.Test;

public class ContaTestOld {

    @Test
    public void testDebitar() throws OperacaoIlegalException {
        Conta conta = new Conta("123", 20);

        conta.debitar(20);

        assertEquals(0, conta.getSaldo(), 0.0);
    }

    @Test(expected = OperacaoIlegalException.class)
    public void testDebitarValorNegativo() throws OperacaoIlegalException {
        Conta conta = new Conta("123", 20);

        conta.debitar(-50);
    }

    @Test(expected = OperacaoIlegalException.class)
    public void testDebitarValorInvalido() throws OperacaoIlegalException {
        Conta conta = new Conta("123", 20);

        conta.debitar(30);
    }

    @Test
    public void testCreditar() throws OperacaoIlegalException {
        Conta conta = new Conta("123", 50);

        conta.creditar(50);

        assertEquals(100, conta.getSaldo(), 0.0);
    }

    @Test(expected = OperacaoIlegalException.class)
    public void testCreditarValorNegativo() throws OperacaoIlegalException {
        Conta conta = new Conta("123", 50);

        conta.creditar(-50);
    }

    @Test
    public void testTransferir() throws OperacaoIlegalException {
        Conta contaOrigem = new Conta("1", 100);
        Conta contaDestino = new Conta("2", 100);

        contaOrigem.transferir(contaDestino, 50);

        assertEquals(50, contaOrigem.getSaldo(), 0.0);
        assertEquals(150, contaDestino.getSaldo(), 0.0);
    }
}