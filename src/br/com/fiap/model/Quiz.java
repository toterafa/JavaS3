package br.com.fiap.model;

import java.time.LocalDate;

public class Quiz {
	
	private int id;
	private Pergunta pergunta;
	private Resposta alternativa;
	private int resultado;
	private LocalDate data;
	
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Pergunta getPergunta() {
		return this.pergunta;
	}

	public void setPergunta(Pergunta pergunta) {
		this.pergunta = pergunta;
	}


	public Resposta getAlternativa() {
		return this.alternativa;
	}
	public void setAlternativa(Resposta alternativa) {
		this.alternativa = alternativa;
	}


	public int getResultado() {
		return this.resultado;
	}
	public void setResultado(int resultado) {
		this.resultado = resultado;
	}
	public LocalDate getData() {
		return this.data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}


}
