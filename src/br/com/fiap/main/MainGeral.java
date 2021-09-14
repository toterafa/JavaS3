package br.com.fiap.main;
import br.com.fiap.model.Usuario;
import br.com.fiap.model.Quiz;
import br.com.fiap.model.Pergunta;
import br.com.fiap.model.Resposta;
import br.com.fiap.model.ProgressoUsuario;

import java.time.LocalDate;

public class MainGeral {

    public static void main(String[] args) {

    Usuario u1 = new Usuario();
    u1.setNome("Rafael Fernandes");
    u1.setId(654321);
    u1.setDataDeNascimento(LocalDate.of(2000,12,12));
    u1.setGenero("Masculino");
    u1.setEstadoUf("SP");
    u1.setEstadoCivil("Solteiro");
    u1.setEmail("rafael@rafael.com");
    u1.setSenha("123456789");

    Resposta r1 = new Resposta();
    r1.setOpcao(1);


    Pergunta p1 = new Pergunta();
    p1.setTexto("Como você está se sentindo durante a pandemia?");
    p1.setAlternativa(r1);

    Quiz q1 = new Quiz();
    q1.setId(17852369);
    q1.setPergunta(p1);
    q1.setAlternativa(r1);
    q1.setResultado(5);
    q1.setData(LocalDate.of(2020,8,19));

    ProgressoUsuario pu1 = new ProgressoUsuario();
    pu1.setQuiz(q1);
    pu1.setUsuario(u1);

    System.out.println("ID do usuario: " + u1.getId());
    System.out.println("Nome do usuario: " + u1.getNome());
    System.out.println("Data de Nascimento: " + u1.getDataDeNascimento());
    System.out.println("Gênero: " + u1.getGenero());
    System.out.println("Estado (UF): " + u1.getEstadoUf());
    System.out.println("Estado Civil: " + u1.getEstadoCivil());
    System.out.println("E-mail do usuário: " + u1.getEmail());
    System.out.println("Senha do usuário: " + u1.getSenha());

    System.out.println("------------------------------------");

    System.out.println("ID do Quiz :" + q1.getId());
    System.out.println("Pergunta 1 :" + q1.getPergunta().getTexto());
    System.out.println("Resposta escolhida: " + q1.getAlternativa().getOpcao());
    System.out.println("Resultado: " + q1.getResultado());

    System.out.println("------------------------------------");
    System.out.println("Progresso :");
    System.out.println("Id do Quiz: " + pu1.getQuiz().getId());
    System.out.println("Id do usuário: " + pu1.getUsuario().getId());

    }
}