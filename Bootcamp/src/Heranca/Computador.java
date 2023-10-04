package Heranca;

public class Computador {
	
		public static void main(String[] args) {
			
			/*MSNMessenger msn = new MSNMessenger();
			msn.enviarMensagem();
			msn.receberMensagem();
			
			FacebookMessenger fbm = new FacebookMessenger();
			fbm.enviarMensagem();
			fbm.receberMensagem();
			
			Telegram tlg = new Telegram();
			tlg.enviarMensagem();
			tlg.receberMensagem();
			*/
			ServicoMensagemInstantanea smi = null;
			
			String appEscolhido="???"; 
			
			if(appEscolhido.equals("msn"))
				smi = new MSNMessenger();
			else if(appEscolhido.equals("fbm"))
				smi = new FacebookMessenger();
			else if(appEscolhido.equals("tlg"))
				smi = new Telegram();
			
				
			smi.enviarMensagem();
			smi.receberMensagem();
		}
	}


