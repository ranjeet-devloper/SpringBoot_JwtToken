package ExceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.web.firewall.RequestRejectedException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(UserException.class)
	public ResponseEntity<String> handleUserException(UserException ex)
	{
		String msg=ex.getMessage();
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}

}
