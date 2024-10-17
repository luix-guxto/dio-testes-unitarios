package com.junittestes;

public class ConsumoOperadora {
    public static void main(String[] args) {

    }
    public static String calcConsumo(String entrada) {
        String[] semanas = entrada.split(",");
        int maiorSemana = 0;
        int valorMaiorSemana = 0;
        int media = 0;
        int total = 0;
        for(int i = 0; i < semanas.length; i++){
            int valorSemana = Integer.parseInt(semanas[i]);
            total += valorSemana;
            if(valorSemana > valorMaiorSemana){
                maiorSemana = (i+1);
                valorMaiorSemana = valorSemana;
            }
        }
        media = total/semanas.length;

        return "Total mensal: "+total+" MB\n" +
                "Media semanal: "+media+" MB\n" +
                "Maior consumo: Semana "+maiorSemana;

    }
}
