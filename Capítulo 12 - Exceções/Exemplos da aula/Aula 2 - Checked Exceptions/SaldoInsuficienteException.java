package org.example;

public class SaldoInsuficienteException extends Exception { //RuntimeException {

    public SaldoInsuficienteException(String mensagem) {
        super(mensagem);
    }
}
