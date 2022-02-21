package br.com.dio.exceptions;

public class DivisaoPorZeroException extends Exception {

    final int numerador;
    final int denominador;

    public DivisaoPorZeroException(String message, int numerador, int denominador) {
        super(message);
        this.numerador = numerador;
        this.denominador = denominador;
    }
}
