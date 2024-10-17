package com.junittestes;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.DisplayName.class)
public class TestConsumoOperadora {
    @DisplayName("Teste 1")
    @Test
    public void testC(){
        String entrada = "2064,4000,2000,3200";
        String saidaEsperada = "Total mensal: 11264 MB\n" +
                "Media semanal: 2816 MB\n" +
                "Maior consumo: Semana 2";
        Assertions.assertEquals(saidaEsperada, ConsumoOperadora.calcConsumo(entrada));
    }

    @DisplayName("Teste 2")
    @Test
    public void testB(){
        String entrada = "5000,4880,4600,6000";
        String saidaEsperada = "Total mensal: 20480 MB\n" +
                "Media semanal: 5120 MB\n" +
                "Maior consumo: Semana 4";
        Assertions.assertEquals(saidaEsperada, ConsumoOperadora.calcConsumo(entrada));
    }

    @DisplayName("Teste 3")
    @Test
    public void testA(){
        String entrada = "4000,4456,6000,5000";
        String saidaEsperada = "Total mensal: 19456 MB\n" +
                "Media semanal: 4864 MB\n" +
                "Maior consumo: Semana 3";
        Assertions.assertEquals(saidaEsperada, ConsumoOperadora.calcConsumo(entrada));
    }
}
