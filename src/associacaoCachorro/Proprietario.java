package associacaoCachorro;

/**
 *
 * @author timoteodimapereira
 */
public class Proprietario {
    private String nome;
    private String endereco;
    private Filiacao filiacao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Filiacao getFiliacao() {
        return filiacao;
    }

    public void setFiliacao(Filiacao filiacao) {
        this.filiacao = filiacao;
    }

    public Proprietario(String nome, String endereco, Filiacao filiacao) {
        this.nome = nome;
        this.endereco = endereco;
        this.filiacao = filiacao;
    }
public String toString(){
    return 
                "\n Nome: "+getNome()+
                "\n Endereco: "+getEndereco()+
            "\n *****FILIAÇÃO DO PROPRIETÁRIO****: "+getFiliacao();
}
   
}
