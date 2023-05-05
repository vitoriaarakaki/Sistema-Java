package Cad.Cliente;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Cad.ConexaoDB.Conexao;

public class ClienteDAO {
	
	private PreparedStatement preparador;
	private ResultSet result;
	
	public void cadastrar(Cliente cliente) {
		
		Connection conexao = Conexao.conexao();
		
		String sql = "INSERT INTO CLIENTE(nome, sobrenome, dataNasc, documento, telefone, endereco, email, user, senha) VALUES (?,?,?,?,?,?,?,?,?)";
		
		try {
			preparador = conexao.prepareStatement(sql);
			preparador.setString(1, cliente.getNome());
			preparador.setString(2, cliente.getSobrenome());
			preparador.setDate(3, new Date(cliente.getDataNasc().getTime()));
			preparador.setString(4, cliente.getDocumento());
			preparador.setString(5, cliente.getTelefone());
			((Endereco) preparador).setEndereco(null);
			preparador.setString(7,  cliente.getEmail());
			preparador.setString(8, cliente.getUser());
			preparador.setString(9, cliente.getSenha());
			
			preparador.execute();
			System.out.println("Cliente cadastrado com sucesso!!");
			conexao.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public Cliente clienteLogin(String user, String senha) {
		
		Cliente cliente = null;
		String query = "SELECT * FROM CLIENTE WHERE user=? AND senha=?";
		Connection conexao = Conexao.conexao();
		
		try {
			preparador = conexao.prepareStatement(query);
			preparador.setString(1, user);
			preparador.setString(2, senha);
			result = preparador.executeQuery();
			
			if (result.next()) {
				cliente = new Cliente();
				cliente.setIdCliente(result.getInt("idCliente"));
				cliente.setNome(result.getString("nome"));
				cliente.setSobrenome(result.getString("sobrenome"));
				cliente.setDataNasc(result.getDate("dataNasc"));
				cliente.setDocumento(result.getString("documento"));
				cliente.setTelefone(result.getString("telefone"));
				cliente.setEndereco(((Endereco) result).getEndereco());
				cliente.setEmail(result.getString("email"));
				cliente.setUser(result.getString("user"));
				cliente.setSenha(result.getString("senha"));
			}
			
			conexao.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		return cliente;
	}

}
