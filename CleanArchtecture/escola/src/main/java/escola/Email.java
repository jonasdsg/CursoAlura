package escola;
import static java.util.Objects.isNull;

public class Email {
	private String email;
	Email(String email){
		
		if(isNull(email) || !email.matches("(\\w|_)+@(\\w|\\.)+")) {
			throw new IllegalArgumentException("Email inválido!");
		}

		this.email = email;	
	}
	
	public String getEmail() {
		return email;
	}
}
