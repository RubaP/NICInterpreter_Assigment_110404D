package cse.maven.sample.exception;

public class InvalidNICNumberException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidNICNumberException() {
		super("Invalid NIC number entered");
	}
        
        public InvalidNICNumberException(String message) {
		super(message);
	}
        
}
