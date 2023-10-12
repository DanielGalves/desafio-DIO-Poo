package desafioDioPoo;

public class Safari implements Navegador {
	
	String url;
	
	public void exibirPagina(String url) {
		System.out.println("Exibindo a pagina " + url);		
	}	
	
	public void adicionarNovaAba(String url) {
		System.out.println("Abrir nova Aba com a URL " + url);
		
	}
	public void atualizarPagina(String url){
		System.out.println("Atualizando a pagina " + url);
		
	}
	
	
}
