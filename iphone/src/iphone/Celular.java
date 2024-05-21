package iphone;
import iphone.navegador.*;
import iphone.reprodutorMusical.*;
import iphone.telefone.*;

public class Celular {
	public static void main(String[]args) {
		
		Adicionar adicionar = new Navegador();
		adicionar.adicionar();
		
		Atualizar atualizar = new Navegador();
		atualizar.atualizar();
		
		Exibir exibir = new Navegador();
		exibir.exibir();
		
		SeletorMuscia selecionarMusica = new ReprodutorMusical();
		selecionarMusica.selecionarMusica();
		
		Tocar tocar = new ReprodutorMusical();
		tocar.tocar();
		
		Pausar pausar = new ReprodutorMusical();
		pausar.pausar();
		
		Atendimento atender = new Telefone();
		atender.atender();
		
		Ligacao ligar = new Telefone();
		ligar.ligar();
		
		CorreioDeVoz gravarCorreio = new Telefone();
		gravarCorreio.gravarCorreio();		
		
	}
	

}
