package Heranca;

	//a classe MSNMessenger é ou representa
	public class ServicoMensagemInstantanea {
		/* MANEIRA UM 
		public void enviarMensagem() {
			//primeiro confirmar se esta conectado a internet
			validarConectadoInternet();
			System.out.println("Enviando mensagem");
			//depois de enviada, salva o histórico da mensagem
			salvarHistoricoMensagem();
		}
		public void receberMensagem() {
			System.out.println("Recebendo mensagem");
		}
		
		//métodos privadas, visíveis somente na classe
		private void validarConectadoInternet() {
			System.out.println("Validando se está conectado a internet");
		}
		private void salvarHistoricoMensagem() {
			System.out.println("Salvando o histórico da mensagem");
			*/
		
		//MANEIRA DOIS 
		public void enviarMensagem() {
		}
		public void receberMensagem() {
		}	
		

		//mais um método que todos os filhos deverão implementar
		public void salvarHistoricoMensagem() {
		}
		
		//somente os filhos conhecem este método
		protected void validarConectadoInternet() {
			System.out.println("Validando se está conectado a internet");
		}	
		
		}
	//}

