package com.apple.entity;

import com.apple.app.NavegadorInternet;

public class NavegadorInternetApp implements NavegadorInternet {

	public void instalar(String sistemaOperacional) {
		if(sistemaOperacional == null) {
			throw new NullPointerException("O sistema operacional não deve ser nulo");
		}
		System.out.println("Aplicativo instalado em " + sistemaOperacional);
	}
	
	@Override
	public void exibirPagina() {
		System.out.println("Exibir página.");
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionar nova aba.");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizar página.");
		
	}

}
