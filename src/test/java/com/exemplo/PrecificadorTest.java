package com.exemplo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrecificadorTest {

    private final Precificador p = new Precificador();

    @Test
    void semDescontoAbaixoDe10() {
        assertEquals(90.0, p.precoFinal(10.0, 9), 0.001);
    }

    @Test
    void cincoPorCentoAPartirDe10() {
        assertEquals(95.0, p.precoFinal(10.0, 10), 0.001);
    }

    @Test
    void quinzePorCentoAPartirDe100() {
        assertEquals(850.0, p.precoFinal(10.0, 100), 0.001);
    }

    @Test
    void rejeitaValoresNegativos() {
        assertThrows(IllegalArgumentException.class, () -> p.precoFinal(-1.0, 5));
    }
}
