package Password;

//Falta a conexão com o Maven

public class Codification {

	public static void main(String[] args) {
		
		String originalPassword = "password987";
		
		// Gerar o hash da senha
		String hashedPassword = hashPassword(originalPassword);
		
		// Verificar se a senha inserida corresponde ao hash
		boolean correctPassword = checkPassword("password987", hashedPassword);
		
		System.out.println("Original password: " + originalPassword);
		System.out.println("Hash password: " + hashedPassword);
		System.out.println("Check password: " + correctPassword);

	}
	
	// Função para gerar o hash da senha
	public static String hashPassword(String password) {
		
		int rounds = 12;
		return BCrypt.hashpw(password, BCrypt.gensalt(rounds));
		
	}

	// Função para verificar se a senha inserida corresponde ao hash
	public static boolean checkPassword(String password, String hashedPassword) {
		
		return BCrypt.checkpw(password, hashedPassword);
	}
}
