package com.junittestes;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.DisplayName.class)
public class TestLimiteOperadora {

    @DisplayName("Teste1")
    @Test
    void teste1(){
        String[] entrada = {"10","11264"};
        String saidaEsperada = "Limite de dados excedido. Compre ou renove seu pacote.";

        Assertions.assertEquals(saidaEsperada,LimiteOperadora.calcLimite(entrada));
    }

    @DisplayName("Teste2")
    @Test
    void teste2(){
        String[] entrada = {"25","20480"};
        String saidaEsperada = "Voce ainda possui 5120 MB disponiveis.";

        Assertions.assertEquals(saidaEsperada,LimiteOperadora.calcLimite(entrada));
    }

    @DisplayName("Teste3")
    @Test
    void teste3(){
        String[] entrada = {"20","19456"};
        String saidaEsperada = "Voce ainda possui 1024 MB disponiveis.";

        Assertions.assertEquals(saidaEsperada,LimiteOperadora.calcLimite(entrada));

    }
}
