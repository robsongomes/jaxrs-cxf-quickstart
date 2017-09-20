package br.com.robsonaraujo.service.exception;

public class BusinessException extends RuntimeException {
	private static final long serialVersionUID = -7260764425426013555L;
	
	public BusinessException() {
	}
	
	public BusinessException(String message) {
		super(message);
	}
	

}
