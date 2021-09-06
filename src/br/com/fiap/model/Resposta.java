package br.com.fiap.model;

public class Resposta {

    private int opcao;

    public int getOpcao(){
        return this.opcao;
    }

    public void setOpcao(int opcao){
        this.opcao = opcao;
    }

    public void selecionaResposta(int opcao){
        switch (opcao){
            case 1:
                // Caso o usuário escolha a opção, ela será salva no banco de dados, relacionada a pergunta atual
                break;
            case 2:
                // Caso o usuário escolha a opção, ela será salva no banco de dados, relacionada a pergunta atual
                break;
            case 3:
                // Caso o usuário escolha a opção, ela será salva no banco de dados, relacionada a pergunta atual
                break;
            case 4:
                // Caso o usuário escolha a opção, ela será salva no banco de dados, relacionada a pergunta atual
                break;
            case 5:
                // Caso o usuário escolha a opção, ela será salva no banco de dados, relacionada a pergunta atual
                break;
            default:
                //Caso algum erro aconteça
                break;
        }

    }

}
