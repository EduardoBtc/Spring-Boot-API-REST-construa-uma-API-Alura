package br.com.alura.forum.controller.dto;

import java.time.LocalDateTime;

import br.com.alura.forum.modelo.Resposta;

public class RespostaDto {
	
	private long id;
	private String mensagem;
	private LocalDateTime dataCriacao;
	private String nomeUser;
	
	public RespostaDto (Resposta resposta) {
		this.id = resposta.getId();
		this.mensagem = resposta.getMensagem();
		this.dataCriacao = resposta.getDataCriacao();
		this.nomeUser = resposta.getAutor().getNome();
	}

	public long getId() {
		return id;
	}

	public String getMensagem() {
		return mensagem;
	}

	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}

	public String getNomeUser() {
		return nomeUser;
	}
}