package in.co.rays.project_3.exception;

public class DatabaseException extends Exception{
	/**
	 * @author Yuvraj Sendhav
	 */
	private static final long serialVersionUID = 1L;

	public DatabaseException(String msg){
		super(msg);
	}
}