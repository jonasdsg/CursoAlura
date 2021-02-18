package br.com.alura.escola.infra.aluno;

import static br.com.alura.escola.dominio.aluno.FabricaDeAluno.novoAluno;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.CPF;
import br.com.alura.escola.dominio.aluno.RepositorioDeAlunos;

public class RepositorioDeAlunosJDBC implements RepositorioDeAlunos {
	
	private final Connection connection;
	
	RepositorioDeAlunosJDBC(Connection connection){
		this.connection = connection;
	}
	
	@Override
	public void matricularAluno(Aluno aluno) {
		String sql = "INSERT INTO ALUNO VALUES (?,?,?)";
		 try {
			PreparedStatement ps = this.connection.prepareStatement(sql);
			ps.setString(1, aluno.getNome());
			ps.setString(2, aluno.getCPF());
			ps.setString(3, aluno.getEmail());
			ps.execute();
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
	}

	@Override
	public Aluno buscarAlunoPorCPF(CPF cpf) {
		Aluno aluno = null;
		String sql = "SELECT * FROM ALUNO WHERE CPF="+cpf.getCpf();
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				aluno = novoAluno()
								.comNome(rs.getString("NOME"))
								.comCPF(rs.getString("CPF"))
								.comEmail("EMAIL")
								.criar();
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return aluno;
	}

	@Override
	public List<Aluno> listarAlunos() {
		List<Aluno> alunos = new ArrayList<Aluno>();
		try {
			PreparedStatement ps = connection.prepareStatement("SELECT * FROM ALUNO");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Aluno aluno = novoAluno()
								.comNome(rs.getString("NOME"))
								.comCPF(rs.getString("CPF"))
								.comEmail("EMAIL")
								.criar();
				alunos.add(aluno);
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return alunos;
	}

}
