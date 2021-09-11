package br.com.fiap.model;

public class Pergunta {
    private String texto;
    private Resposta alternativa;



    //getters
    public String getTexto() {
        return this.texto;
    }
    public Resposta getAlternativa() {
        return alternativa;
    }

    //setter
    public void setTexto(String texto) {
        this.texto = texto;
    }

    public void setAlternativa(Resposta alternativa) {
        this.alternativa = alternativa;
    }
}
