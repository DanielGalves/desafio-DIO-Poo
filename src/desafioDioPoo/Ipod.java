package desafioDioPoo;

public class Ipod implements ReprodutorMusical{
	String musica;
	
	
	public void tocar(String musica){
		System.out.println("Tocando Musica " + musica );		
	}
	
	public void pausar(String musica) {
		System.out.println("Pausando a Musica " + musica);
	}
	
	public void selecionarMusica(String musica) {
		System.out.println("Musica selecionada " + musica);
	}
	
	

}
