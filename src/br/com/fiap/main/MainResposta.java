package br.com.fiap.main;

import br.com.fiap.model.Resposta;

public class MainResposta {
    public static void main(String[] args) {
        Resposta resposta = new Resposta();

        resposta.setOpcao(5);
        resposta.selecionaResposta(resposta.getOpcao());

        System.out.println("O usuário escolheu a resposta: " + resposta.getOpcao());
    }
}
