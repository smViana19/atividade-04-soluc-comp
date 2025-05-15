package org.samuel;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {

    boolean ok = false;
    ContaBancaria c1 = new ContaBancaria(1, "Leticia", 100.0);

    System.out.printf("Saldo inicial (c1): " + c1.getSaldo());
    c1.depositar(200.0);
    System.out.println("Após deposito de R$200,00: " + c1.getSaldo());

    ok = c1.sacar(700.0);
    System.out.println("Tentativa de saque de R$700,00: " + (ok ? "Sucesso" : "Falha ao sacar"));
    System.out.println("Saldo final (c1): " + c1.getSaldo());

    ContaBancaria c2 = new ContaBancaria(2, "Maria", 3500);
    System.out.printf("Saldo inicial (c2): " + c2.getSaldo());
    c2.depositar(59770.0);
    System.out.println("Após deposito de R$50,00: " + c2.getSaldo());

    ok = c2.sacar(50.0);
    System.out.println("Tentativa de saque de 50 reais: " + (ok ? "Sucesso" : "Falha ao sacar"));
    System.out.println("Saldo final (c2): " + c2.getSaldo());

  }
}