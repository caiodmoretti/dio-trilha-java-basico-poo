package com.apple.entity;

import com.apple.app.AparelhoTelefonico;
import com.apple.app.NavegadorInternet;
import com.apple.app.ReprodutorMusical;

public class Iphone {
	private ReprodutorMusical reprodutorMusical;
	private AparelhoTelefonico aparelhoTelefonico;
	private NavegadorInternet navegadorInternet;
	
	public Iphone(ReprodutorMusical reprodutorMusical, AparelhoTelefonico aparelhoTelefonico,
			NavegadorInternet navegadorInternet) {
		this.reprodutorMusical = reprodutorMusical;
		this.aparelhoTelefonico = aparelhoTelefonico;
		this.navegadorInternet = navegadorInternet;
	}

	public void ligar() {
		System.out.println("O Iphone foi ligado.");
	}
	public void desligar() {
		System.out.println("O Iphone foi desligado.");
	}
	
	public ReprodutorMusical getReprodutorMusical() {
		return reprodutorMusical;
	}

	public void setReprodutorMusical(ReprodutorMusical reprodutorMusical) {
		this.reprodutorMusical = reprodutorMusical;
	}

	public AparelhoTelefonico getAparelhoTelefonico() {
		return aparelhoTelefonico;
	}

	public void setAparelhoTelefonico(AparelhoTelefonico aparelhoTelefonico) {
		this.aparelhoTelefonico = aparelhoTelefonico;
	}

	public NavegadorInternet getNavegadorInternet() {
		return navegadorInternet;
	}

	public void setNavegadorInternet(NavegadorInternet navegadorInternet) {
		this.navegadorInternet = navegadorInternet;
	}
	
	

}
