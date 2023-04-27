package Cad.Cliente;

import java.util.Date;

public class Cliente {
	
	private Integer IdCliente;
	
	private String Nome;
	private String Sobrenome;
	private Date DataNasc;
	private String Documento;
	private String Telefone;
	private Endereco Endereco;
	private String Email;
	private String User;
	private String Senha;
	
	
	public Cliente(Integer idCliente, String nome, String sobrenome, Date dataNasc, String documento, 
			String telefone, Endereco endereco, String email, String user, String senha) {
		super();
		IdCliente = idCliente;
		Nome = nome;
		Sobrenome = sobrenome;
		DataNasc = dataNasc;
		Documento = documento;
		Telefone = telefone;
		Endereco = endereco;
		Email = email;
		User = user;
		Senha = senha;
	}
	
	public Cliente(String nome, String sobrenome, Date dataNasc, String documento, 
			String telefone, String email, String user, String senha) {
		super();
		Nome = nome;
		Sobrenome = sobrenome;
		DataNasc = dataNasc;
		Documento = documento;
		Telefone = telefone;
		Email = email;
		User = user;
		Senha = senha;
		
	}
	
	public Cliente() {
		
	}

	public Integer getIdCliente() {
		return IdCliente;
	}

	public void setIdCliente(Integer idCliente) {
		IdCliente = idCliente;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getSobrenome() {
		return Sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		Sobrenome = sobrenome;
	}

	public Date getDataNasc() {
		return DataNasc;
	}

	public void setDataNasc(Date dataNasc) {
		DataNasc = dataNasc;
	}

	public String getDocumento() {
		return Documento;
	}

	public void setDocumento(String documento) {
		Documento = documento;
	}

	public String getTelefone() {
		return Telefone;
	}

	public void setTelefone(String telefone) {
		Telefone = telefone;
	}

	public Endereco getEndereco() {
		return Endereco;
	}

	public void setEndereco(Endereco endereco) {
		Endereco = endereco;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getUser() {
		return User;
	}

	public void setUser(String user) {
		User = user;
	}

	public String getSenha() {
		return Senha;
	}

	public void setSenha(String senha) {
		Senha = senha;
	}
	
	public void CadastrarCliente(Cliente cliente) {
		
	}
}
