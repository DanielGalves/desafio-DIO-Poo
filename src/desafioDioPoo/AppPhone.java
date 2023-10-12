package desafioDioPoo;

public class AppPhone implements AparelhoTelefonico{
	
	String contato;
	
	 public void ligar(String contato) {
		 
		 System.out.println("Ligando para" + contato);
		 
	 }
	 
	 public void atender(String Contato) {
		 
		 System.out.println("Atender " + contato);
		 
	 }
		 
	 public void correioDeVoz(String Contato) {
		 
		 System.out.println("Gravar mensagem de voz para " + contato);
		 
	 }


}
