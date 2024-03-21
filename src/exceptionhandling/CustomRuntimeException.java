package exceptionhandling;

public class CustomRuntimeException extends RuntimeException{
	

	public CustomRuntimeException(String exception,Throwable thro) {
		super(exception,thro);
	}

}
