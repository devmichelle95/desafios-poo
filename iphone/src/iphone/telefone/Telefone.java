package iphone.telefone;

public class Telefone implements Atendimento, CorreioDeVoz, Ligacao {
	public void atender() {
		System.out.println("Atendeu");
	}
	
	public void ligar() {
		System.out.println("Liganco");
	}
	
	public void gravarCorreio() {
		System.out.println("Gravando correio de voz");
	}
	

}
