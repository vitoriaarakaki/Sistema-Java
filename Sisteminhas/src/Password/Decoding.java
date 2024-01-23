package Password;

import java.util.Scanner;
//import do Maven

public class Decoding {

	public static void main(String[] args) {

		//Hash do armazenamento seguro (por exemplo, banco de dados)
		String hashedStoredPassword = "yedsufgvhcUYERGBPUuigeih545f4ES85DFV48";

		//Solicite ao usuário para inserir a senha
		Scanner scanner = new Scanner(System.in);
		System.out.println("Type your password: ");
		String passwordEntered = scanner.nextLine();
        
		// Verifique se a senha inserida corresponde ao hash armazenado
		if (checkPassword(passwordEntered, hashedStoredPassword)) {
			System.out.println("Correct Password");
		} else {
			System.out.println("Incorrect Password");
		}

	}
	
	// Função para verificar se a senha inserida corresponde ao hash
	public static boolean checkPassword(String password, String hashedPassword) {
		return BCrypt.checkpw(password, hashedPassword);
	}

}
