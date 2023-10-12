package desafioDioPoo;

public class Iphone {
	public static void main(String [] args) {
		
		ReprodutorMusical ipod = new Ipod();
		ipod.tocar("The Unforgiven");
		ipod.pausar("The Unforgiven");
		ipod.selecionarMusica("One");
		
		AparelhoTelefonico phone = new AppPhone();
		phone.ligar("João");
		phone.atender("Maria");
		phone.correioDeVoz("Bruxa");
		
		Navegador safari = new Safari();
		safari.exibirPagina("http://google.com");
		safari.adicionarNovaAba("http://linkedin.com");
		safari.atualizarPagina("http://google.com");
		
		
		
	}

}
