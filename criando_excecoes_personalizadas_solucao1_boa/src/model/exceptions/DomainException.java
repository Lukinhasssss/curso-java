package model.exceptions;

public class DomainException extends Exception { // O Exception pode ser trocado pelo RuntimeException

	private static final long serialVersionUID = 1L;
	
	public DomainException(String msg) {
		super(msg); // Repassa a mensagem para o construtor da superclasse
	}

}
