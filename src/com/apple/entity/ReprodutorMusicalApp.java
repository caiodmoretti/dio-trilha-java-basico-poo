package com.apple.entity;

import com.apple.app.ReprodutorMusical;

public class ReprodutorMusicalApp implements ReprodutorMusical {
	
	public void instalar(String sistemaOperacional) {
		if(sistemaOperacional == null) {
			throw new NullPointerException("O sistema operacional n�o deve ser nulo");
		}
		System.out.println("Aplicativo instalado em " + sistemaOperacional);
	}
	@Override
	public void tocar() {
		System.out.println("Tocar m�sica.");
		
	}

	@Override
	public void pausar() {
		System.out.println("Pausar m�sica.");
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Selecionar m�sica.");
		
	}
	
}
