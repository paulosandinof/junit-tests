package com.teste;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest {

    // Critérios todos de todos os nós

    @Test(expected = IdadeInvalidaException.class)
    public void test1() throws IdadeInvalidaException {
        App app = new App();
        app.avaliaEmpregabilidade(-1, false);
    }

    @Test
    public void test11() throws IdadeInvalidaException {
        App app = new App();
        app.avaliaEmpregabilidade(0, true);
    }

    @Test
    public void test3() throws IdadeInvalidaException {
        App app = new App();
        app.avaliaEmpregabilidade(16, false);
    }

    @Test
    public void test4() throws IdadeInvalidaException {
        App app = new App();
        app.avaliaEmpregabilidade(61, false);
    }

    @Test
    public void test5() throws IdadeInvalidaException {
        App app = new App();
        app.avaliaEmpregabilidade(61, true);
    }

    @Test
    public void test6() throws IdadeInvalidaException {
        App app = new App();
        app.avaliaEmpregabilidade(18, false);
    }

    @Test
    public void test7() throws IdadeInvalidaException {
        App app = new App();
        app.avaliaEmpregabilidade(18, true);
    }
}
