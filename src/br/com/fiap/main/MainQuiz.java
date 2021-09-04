package br.com.fiap.main;

import java.time.LocalDate;
import br.com.fiap.model.Quiz;

public class MainQuiz {

	public static void main(String[] args) {
		
		
		Quiz q1 = new Quiz();
		q1.setId(321);
		q1.setPergunta("Hoje seu dia foi bom?");
		q1.setAlternativa("a");
		q1.setResultado(3);
		q1.setData(LocalDate.of(2021, 05, 23));
		
		q1.setNome("Andrézão da Massa");
		q1.setId(123456);
		q1.setDataDeNascimento(LocalDate.of(2000, 12, 25));
		q1.setGenero("Masculino");
		q1.setEmail("andré@andré");
		q1.setSenha("123");
		
		System.out.println(q1.getId());
		System.out.println(q1.getPergunta());
		System.out.println(q1.getAlternativa());
		System.out.println("Seu nível de ansiedade" + q1.getResultado());
		System.out.println(q1.getData());
		
		System.out.println(q1.getId());
		System.out.println(q1.getNome());
		System.out.println(q1.getDataDeNascimento());
		System.out.println(q1.getGenero());
		System.out.println(q1.getEmail());
		System.out.println(q1.getSenha());

	}

}
