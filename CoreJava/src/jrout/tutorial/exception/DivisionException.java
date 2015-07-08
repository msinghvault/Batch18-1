package jrout.tutorial.exception;

public class DivisionException extends RuntimeException {
	
	private String message;
	public DivisionException(String message) {
		this.message = message;
	}
	
	public String toString() {
		return "User Defined Exp "+ message;
	}
}
