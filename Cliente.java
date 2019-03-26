package Package;

public class Cliente {
	private Livro[] listLivros = new Livro[100];
	private boolean[] sitLivros = new boolean[100];
	private boolean autLivro;
	
	public Cliente(boolean autLivro) {
		this.autLivro = autLivro;
	}
	
	public boolean verifSit() {
		
		return autLivro;
	}
	
	public void reservarLivro(Livro l) {
		
	}
	
	public void emitirExtrato() {
		
	}
}
