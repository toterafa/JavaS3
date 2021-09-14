package br.com.fiap.main;

import java.time.LocalDate;

import br.com.fiap.model.Usuario;

public class MainUsuario {

	public static void main(String[] args) {
	
		
		Usuario u1 = new Usuario();
		u1.setNome("Andrézão da Massa");
		u1.setId(123456);
		u1.setDataDeNascimento(LocalDate.of(2000, 10, 1));
		u1.setGenero("Masculino");
		u1.setEstadoUf("SP");
		u1.setEstadoCivil("Casado");
		u1.setEmail("andré@andré");
		u1.setSenha("123");
		
		System.out.println(u1.getId());
		System.out.println(u1.getNome());
		System.out.println(u1.getDataDeNascimento());
		System.out.println(u1.getGenero());
		System.out.println(u1.getEstadoUf());
		System.out.println(u1.getEstadoCivil());
		System.out.println(u1.getEmail());
		System.out.println(u1.getSenha());

	}

}
