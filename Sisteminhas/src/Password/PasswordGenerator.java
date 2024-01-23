package Password;

import java.security.SecureRandom;

public class PasswordGenerator {

	//Caracteres possíveis para senha 
	private static final String CHARACTER = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_=+";
	
	//Método para gerar senha aleatória 
	public static String generatePassword(int length) {
		StringBuilder password = new StringBuilder(length);
		SecureRandom random = new SecureRandom();
		
		for (int i = 0; i < length; i++) {
			int index = random.nextInt(CHARACTER.length());
			password.append(CHARACTER.charAt(index));
		}
		
		return password.toString();
	}
	
	public static void main(String[] args) {
		//Um exemplo de uso
		String generatedPassword = generatePassword(8);
		System.out.println("Generated password: " + generatedPassword);
	}
}
