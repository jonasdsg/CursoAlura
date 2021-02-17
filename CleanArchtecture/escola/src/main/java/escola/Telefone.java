package escola;
import static java.util.regex.Pattern.matches;
import static java.util.Objects.isNull;

public class Telefone {
	private String telefone;
	Telefone(String telefone){
		if(isNull(telefone) || !matches("\\([0-9]{2}\\)\s(9|)([0-9]{4}){2}",telefone)) {
			throw new IllegalArgumentException("Número inválido!");
		}
		this.telefone = telefone;
	}

	public String getTelefone() {
		return telefone;
	}
}
