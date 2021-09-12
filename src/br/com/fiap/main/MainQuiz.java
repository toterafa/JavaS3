package br.com.fiap.main;

import java.time.LocalDate;

import br.com.fiap.model.Pergunta;
import br.com.fiap.model.Quiz;
import br.com.fiap.model.Resposta;
import br.com.fiap.model.Usuario;

public class MainQuiz {

	public static void main(String[] args) {

		Resposta resp = new Resposta();
		resp.setOpcao(5);

		Pergunta p1 = new Pergunta();
		p1.setTexto("Como foi o seu dia hoje?");

		Quiz q1 = new Quiz();
		q1.setId(321);
		q1.setPergunta(p1);
		q1.setAlternativa(resp);
		q1.setData(LocalDate.of(2021, 05, 23));
		
		Usuario u2 = new Usuario();
		u2.setNome("Andrézão da Massa");
		u2.setId(123456);
		u2.setDataDeNascimento(LocalDate.of(2000, 12, 25));
		u2.setGenero("Masculino");
		u2.setEmail("andré@andré");
		u2.setSenha("123");
		
		System.out.println(q1.getId());
		System.out.println(q1.getPergunta().getTexto());
		System.out.println(q1.getAlternativa().getOpcao());
		System.out.println("Seu nível de ansiedade: " + q1.getResultado());
		System.out.println(q1.getData());
		
		System.out.println(u2.getId());
		System.out.println(u2.getNome());
		System.out.println(u2.getDataDeNascimento());
		System.out.println(u2.getGenero());
		System.out.println(u2.getEmail());
		System.out.println(u2.getSenha());

	}

}
