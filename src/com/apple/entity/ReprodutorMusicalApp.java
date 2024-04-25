package com.apple.entity;

import com.apple.app.ReprodutorMusical;

public class ReprodutorMusicalApp implements ReprodutorMusical {
	
	public void instalar(String sistemaOperacional) {
		if(sistemaOperacional == null) {
			throw new NullPointerException("O sistema operacional não deve ser nulo");
		}
		System.out.println("Aplicativo instalado em " + sistemaOperacional);
	}
	@Override
	public void tocar() {
		System.out.println("Tocar música.");
		
	}

	@Override
	public void pausar() {
		System.out.println("Pausar música.");
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Selecionar música.");
		
	}
	
}
