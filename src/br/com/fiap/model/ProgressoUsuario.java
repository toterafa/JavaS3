package br.com.fiap.model;

public class ProgressoUsuario{
	private Usuario usuario;
    private Quiz quiz;

    public Usuario getUsuario() {
        return usuario;
    }

    public Quiz getQuiz() {
        return quiz;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setQuiz(Quiz quiz) {
        this.quiz = quiz;
    }

    public void relatorioProgresso(Usuario usuario, Quiz quiz){
        //Esse método criará um relatório para o Usuário, contendo várias informações com relação ao Quiz que ele respondeu.
    }
}
