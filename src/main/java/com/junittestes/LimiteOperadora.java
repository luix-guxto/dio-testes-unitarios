package com.junittestes;

public class LimiteOperadora {


    public static String calcLimite(String[] entrada) {

        int limite = Integer.parseInt(entrada[0]) * 1024;
        int consumo = Integer.parseInt(entrada[1]);
        int restante = limite - consumo;

        if(restante <= 0){
            return "Limite de dados excedido. Compre ou renove seu pacote.";
        }
        else{
            return "Voce ainda possui "+restante+" MB disponiveis.";
        }

    }
}
