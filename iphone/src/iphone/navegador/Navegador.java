package iphone.navegador;

public class Navegador implements Exibir, Atualizar, Adicionar {
	public void exibir() {
		System.out.println("Exibir página");
	}
	
	public void atualizar() {
		System.out.println("Atualizar página");
	}
	
	public void adicionar() {
		System.out.println("Adicionar página");
	}
	

}
