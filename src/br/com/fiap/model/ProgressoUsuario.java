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
        //Esse m�todo criar� um relat�rio para o Usu�rio, contendo v�rias informa��es com rela��o ao Quiz que ele respondeu.
    }
}
