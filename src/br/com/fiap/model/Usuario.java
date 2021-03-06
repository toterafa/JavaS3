package br.com.fiap.model;

import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;

public class Usuario {
	private int id;
	private String nome;
	private LocalDate dataDeNascimento;
	private String genero;
	private String estadoUf;
	private String estadoCivil;
	private String email;
	private String senha;

	//getters
	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public LocalDate getDataDeNascimento() {
		return dataDeNascimento;
	}

	public String getGenero() {
		return genero;
	}

	public  String getEstadoUf() {return estadoUf;}

	public String getEstadoCivil(){return estadoCivil;}

	public String getEmail() {
		return email;
	}

	public String getSenha() {
		return senha;
	}


	//setters
	public void setId(int id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setDataDeNascimento(LocalDate dataDeNascimento) {
		int anoAtual = Calendar.getInstance().get(Calendar.YEAR);
		int mesAtual = Calendar.getInstance().get(Calendar.MONTH);
		int diaAtual = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);

		LocalDate dataAtual = LocalDate.of(anoAtual, mesAtual, diaAtual);

		int idade = Period.between(dataDeNascimento, dataAtual).getYears();

		if(idade <= 4){
			System.out.println("Você ainda não atingiu a idade do nosso público alvo");
		}else if(idade >= 100){
			System.out.println("Idade inválida");
		}else if(idade >= 5 || idade <= 99){
			this.dataDeNascimento = dataDeNascimento;
		}else {
			System.out.println("ERRO");
		}
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public void setEstadoUf(String estadoUf){this.estadoUf = estadoUf;}

	public void setEstadoCivil(String estadoCivil) {this.estadoCivil = estadoCivil;}
}
