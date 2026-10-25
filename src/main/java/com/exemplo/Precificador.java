package com.exemplo;

/**
 * Regra de negócio simples pra gente testar no pipeline.
 * Calcula o preço final com desconto por quantidade.
 */
public class Precificador {

    public double precoFinal(double precoUnitario, int quantidade) {
        if (precoUnitario < 0 || quantidade < 0) {
            throw new IllegalArgumentException("Preço e quantidade não podem ser negativos");
        }
        double total = precoUnitario * quantidade;

        if (quantidade >= 100) {
            return total * 0.85; // 15% de desconto
        }
        if (quantidade >= 10) {
            return total * 0.95; // 5% de desconto
        }
        return total;
    }
}
