package com.exemplo;

public class App {
    public static void main(String[] args) {
        Precificador p = new Precificador();
        System.out.println("Versão: " + App.class.getPackage().getImplementationVersion());
        System.out.println("12 itens de R$ 10,00 = R$ " + p.precoFinal(10.0, 12));
    }
}
