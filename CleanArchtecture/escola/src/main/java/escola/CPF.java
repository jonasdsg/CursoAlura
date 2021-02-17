package escola;
import static java.util.Objects.isNull;
import static java.util.regex.Pattern.matches;

public class CPF {
	private String cpf;
	CPF(String cpf){
		
		if(isNull(cpf) || !matches("([0-9]{3}\\.){2}[0-9]{3}-[0-9]{2}",cpf)) {
			throw new IllegalArgumentException("Formato inválido!");
		}
		this.cpf = cpf;
	}
	
	public String getCpf() {
		return cpf;
	}
}
