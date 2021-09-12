package br.com.fiap.main;

import br.com.fiap.model.*;

import java.time.LocalDate;

public class MainProgressoUsuario {
    public static void main(String[] args) {

        Usuario usuario = new Usuario();

        usuario.setId(12345);
        usuario.setNome("Fulano");
        usuario.setEmail("fulano@gmail.com");
        usuario.setGenero("M");
        usuario.setDataDeNascimento(LocalDate.of(2000, 5, 30));
        usuario.setEstadoCivil("Solteiro");
        usuario.setEstadoUf("SP");
        usuario.setSenha("carrosvoadores1");

        Resposta respo = new Resposta();
        respo.setOpcao(5);

        Pergunta pergunta = new Pergunta();
        pergunta.setTexto("Se você fosse chamado para uma festa de uma pessoa desconhecida. Você iria?");
        pergunta.setAlternativa(respo);

        Quiz quiz = new Quiz();
        quiz.setId(3214);
        quiz.setPergunta(pergunta);
        quiz.setData(LocalDate.of(2021, 9, 25));
        quiz.setResultado(9);

        ProgressoUsuario progress = new ProgressoUsuario();
        progress.setUsuario(usuario);
        progress.setQuiz(quiz);

        System.out.println("---USUÁRIO---");
        System.out.println("Nome: " + usuario.getNome());
        System.out.println("E-mail: " + usuario.getEmail());
        System.out.println("Gênero: " + usuario.getGenero());
        System.out.println("Data de nascimento: " + usuario.getDataDeNascimento());
        System.out.println("Estado civil: " + usuario.getEstadoCivil());
        System.out.println("Estado(UF): " + usuario.getEstadoUf());
        System.out.println("Senha: " + usuario.getSenha());
        System.out.println("");
        System.out.println("---PERGUNTA---");
        System.out.println("Pergunta: " + pergunta.getTexto());
        System.out.println("Resposta do usuário: " + pergunta.getAlternativa());
        System.out.println("");
        System.out.println("---QUIZ---");
        System.out.println("ID: " + quiz.getId());
        System.out.println("Pergunta: " + quiz.getPergunta().getTexto());
        System.out.println("Resposta: " + quiz.getPergunta().getAlternativa());
        System.out.println("Data de aplicação: " + quiz.getData());
        System.out.println("Resultado: " + quiz.getResultado());
        System.out.println("");
        System.out.println("");

        System.out.println("Nome usuário: " + progress.getUsuario().getNome());
        System.out.println("Email: " + progress.getUsuario().getEmail());
        System.out.println("Gênero: " + progress.getUsuario().getGenero());
        System.out.println("Data de nascimento: " + progress.getUsuario().getDataDeNascimento());
        System.out.println("Estado civil: " + progress.getUsuario().getEstadoCivil());
        System.out.println("Estado(UF): " + progress.getUsuario().getEstadoUf());
        System.out.println("Senha: " + progress.getUsuario().getSenha());
        System.out.println("");
        System.out.println("ID Quiz:" + progress.getQuiz().getId());
        System.out.println("Pergunta Quiz:" + progress.getQuiz().getPergunta().getTexto());
        System.out.println("Resposta Quiz:" + progress.getQuiz().getPergunta().getAlternativa().getOpcao());
        System.out.println("Data de aplicação Quiz:" + progress.getQuiz().getData());
        System.out.println("Resultado Quiz:" + progress.getQuiz().getResultado());


    }
}
