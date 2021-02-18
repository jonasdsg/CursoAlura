package br.com.alura.escola.aluno;
import static java.util.Objects.isNull;
import static java.util.regex.Pattern.matches;

public class Email {
	private String email;
	Email(String email){
		
		if(isNull(email) || !matches("(\\w|_)+@(\\w|\\.)+",email)) {
			throw new IllegalArgumentException("Email inválido!");
		}

		this.email = email;	
	}
	
	public String getEmail() {
		return email;
	}
}
