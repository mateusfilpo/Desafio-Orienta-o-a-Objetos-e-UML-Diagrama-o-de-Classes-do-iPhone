package application;

import model.Iphone;

public class Main {
	public static void main(String[] args) {
		Iphone iphone = new Iphone("iPhone 15 PRO", "(55) (21) 99999-9999");
		
		//Exibindo o modelo e o número
		System.out.println("Modelo: " + iphone.getModelo());
		System.out.println("Número: " + iphone.getNumero());
		System.out.println("--------------");
		
		//Usando o Reprodutor Musical
		System.out.println("Reprodutor Musical:");
		iphone.selecionarMusica();
		iphone.tocar();
		iphone.pausar();
		System.out.println("--------------");
		
		//Usando o Aparelho Telefonico
		System.out.println("Chamadas:");
		iphone.atender();
		iphone.ligar();
		iphone.iniciarCorreioVoz();
		System.out.println("--------------");
		
		//Usando o Navegador
		System.out.println("Navegador:");
		iphone.exibirPagina();
		iphone.adicionarPagina();
		iphone.atualizarPagina();
		
	}
}
