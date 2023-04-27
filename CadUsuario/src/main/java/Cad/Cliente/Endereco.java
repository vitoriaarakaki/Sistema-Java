package Cad.Cliente;

public class Endereco extends Cliente {
	
	private Integer CEP;
	private String Rua;
	private Integer Numb;
	private String Bairro;
	private String Cidade;
	private String Estado;

	private Cliente Cliente;
	
	public Endereco(Integer cep, String rua, Integer numb, String bairro, String cidade, String estado, Cliente cliente) {
		super();
		CEP = cep;
		Rua = rua;
		Numb =  numb;
		Bairro = bairro;
		Cidade = cidade;
		Estado = estado;
		Cliente = cliente;
	}
	
	public Endereco(Integer cep, String rua, Integer numb, String bairro, String cidade, String estado) {
		super();
		CEP = cep;
		Rua = rua;
		Numb =  numb;
		Bairro = bairro;
		Cidade = cidade;
		Estado = estado;
	}
	
	public Endereco() {
		
	}

	public Integer getCEP() {
		return CEP;
	}

	public void setCEP(Integer cEP) {
		CEP = cEP;
	}

	public String getRua() {
		return Rua;
	}

	public void setRua(String rua) {
		Rua = rua;
	}

	public Integer getNumb() {
		return Numb;
	}

	public void setNumb(Integer numb) {
		Numb = numb;
	}

	public String getBairro() {
		return Bairro;
	}

	public void setBairro(String bairro) {
		Bairro = bairro;
	}

	public String getCidade() {
		return Cidade;
	}

	public void setCidade(String cidade) {
		Cidade = cidade;
	}

	public String getEstado() {
		return Estado;
	}

	public void setEstado(String estado) {
		Estado = estado;
	}

	public Cliente getCliente() {
		return Cliente;
	}

	public void setCliente(Cliente cliente) {
		Cliente = cliente;
	}
	
	public void CadastrarCliente(Cliente cliente) {
		
	}
}

