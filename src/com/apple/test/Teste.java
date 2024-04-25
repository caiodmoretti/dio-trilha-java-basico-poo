package com.apple.test;
import com.apple.app.*;
import com.apple.entity.*;
public class Teste {

	public static void main(String[] args) {
		ReprodutorMusical repMusical1 = new ReprodutorMusicalApp();
		AparelhoTelefonico apTelefonico1 = new AparelhoTelefonicoApp();
		NavegadorInternet navInternet1 = new NavegadorInternetApp();
		
		Iphone iphone1 = new Iphone(repMusical1,apTelefonico1,navInternet1);
		
		iphone1.ligar();
		iphone1.getReprodutorMusical().selecionarMusica();
		iphone1.getReprodutorMusical().tocar();
		iphone1.getAparelhoTelefonico().atender();
		iphone1.getAparelhoTelefonico().iniciarCorreioVoz();
		iphone1.getNavegadorInternet().adicionarNovaAba();
		iphone1.getNavegadorInternet().atualizarPagina();
		iphone1.desligar();
	}

}
