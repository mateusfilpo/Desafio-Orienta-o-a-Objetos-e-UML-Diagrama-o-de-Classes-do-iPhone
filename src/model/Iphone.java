package model;

import interfaces.AparelhoTelefonico;
import interfaces.NavegadorNaInternet;
import interfaces.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorNaInternet {
	private String modelo;
	private String numero;
	
	public Iphone(String modelo, String numero) {
		this.modelo = modelo;
		this.numero = numero;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public void tocar() {
		System.out.println("Tocando música");
	}
	
	public void pausar() {
		System.out.println("Música pausada");
	}
	
	public void selecionarMusica() {
		System.out.println("Música selecionada");
	}
	
	public void ligar() {
		System.out.println("Você está ligando");
	}
	
	public void atender() {
		System.out.println("Atendendo chamada");
	}
	
	public void iniciarCorreioVoz() {
		System.out.println("Escutando o correio de voz");
	}
	
	public void exibirPagina() {
		System.out.println("Exibindo página da internet");
	}
	
	public void adicionarPagina() {
		System.out.println("Exibindo nova guia no navegador");
	}
	
	public void atualizarPagina() {
		System.out.println("Página atualizada");
	}
}
