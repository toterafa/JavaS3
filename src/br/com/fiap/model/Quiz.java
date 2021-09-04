package br.com.fiap.model;

import java.time.LocalDate;

public class Quiz extends Usuario{
	
	protected int id;
	protected String pergunta;
	protected String alternativa;
	protected int resultado;
	protected LocalDate data;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPergunta() {
		return pergunta;
	}
	public void setPergunta(String pergunta) {
		this.pergunta = pergunta;
	}
	public String getAlternativa() {
		return alternativa;
	}
	public void setAlternativa(String alternativa) {
		this.alternativa = alternativa;
	}
	public int getResultado() {
		return resultado;
	}
	public void setResultado(int resultado) {
		this.resultado = resultado;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	
	
}