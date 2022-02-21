package br.com.dio.exceptions;

public class VetoresTamanhoDiferentesException extends Exception{

    final int tamanhoNumerador;
    final int tamanhoDenominador;

    public VetoresTamanhoDiferentesException(String message, int tamanhoNumerador, int tamanhoDenominador) {
        super(message);
        this.tamanhoNumerador = tamanhoNumerador;
        this.tamanhoDenominador = tamanhoDenominador;
    }
}
