package br.com.fiap.main;

import br.com.fiap.model.Pergunta;
import br.com.fiap.model.Resposta;

public class MainPergunta {
    public static void main(String[] args) {
        Resposta alternativa = new Resposta();
        alternativa.setOpcao(1);

        Pergunta pergunta = new Pergunta();
        pergunta.setTexto("Você se sente incomodado com conversas Face-a-Face durante a pandemia (mesmo com o uso de máscaras)?");
        pergunta.setAlternativa(alternativa);
        pergunta.getTexto();


        System.out.println("Pergunta: " + pergunta.getTexto());
        System.out.println("Resposta: " + pergunta.getAlternativa().getOpcao());
    }
}
