package Cad.ConexaoDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Conexao {
	private static String usuario;
	private static String senha;
	
	public static Connection conexao() {
		
		Connection con = null;
		
		if (usuario == null && senha == null) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Digite seu usuário no MySQL: ");
			usuario = sc.nextLine();
			
			System.out.println("Digite sua senha no MySQL: ");
			senha = sc.nextLine();
			sc.close();
		}
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", usuario, senha);
			System.out.println("Conexão com o Bando de Dados efeituada com Sucesso!!");
		} catch (SQLException | ClassNotFoundException e) {
			System.err.println("XX  Erro ao tentar efetuar a Conexão com o Banco de Dados XX");
			e.printStackTrace();
		}
		
		return con;
	}
}
