package com.teste;

public class FilaVaziaException extends RuntimeException {

	public FilaVaziaException(){
		super();
	}

	public FilaVaziaException(String mensagem){
		super(mensagem);
	}

	public FilaVaziaException(String mensagem, Throwable causa){
		super(mensagem, causa);
	}
}