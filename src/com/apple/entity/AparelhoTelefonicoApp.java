package com.apple.entity;

import com.apple.app.AparelhoTelefonico;

public class AparelhoTelefonicoApp implements AparelhoTelefonico {

	public void instalar(String sistemaOperacional) {
		if(sistemaOperacional == null) {
			throw new NullPointerException("O sistema operacional não deve ser nulo");
		}
		System.out.println("Aplicativo instalado em " + sistemaOperacional);
	}
	@Override
	public void ligar() {
		System.out.println("Ligar aparelho telefônico.");
		
	}

	@Override
	public void atender() {
		System.out.println("Atender.");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciar correio de voz.");
		
	}

}
