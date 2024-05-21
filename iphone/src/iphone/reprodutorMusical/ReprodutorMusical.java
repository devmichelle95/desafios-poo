package iphone.reprodutorMusical;

public class ReprodutorMusical implements SeletorMuscia, Tocar, Pausar {
	
	public void selecionarMusica() {
		System.out.println("Escolha uma música");
	}
	
	public void tocar() {
		System.out.println("Tocando música");
	}
	
	public void pausar() {
		System.out.println("Pausar música");
	}

}
