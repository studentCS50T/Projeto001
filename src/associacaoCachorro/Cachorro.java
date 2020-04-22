package associacaoCachorro;

/**
 *
 * @author timoteodimapereira
 */
public class Cachorro {
    private String codigo;
    private String nome;
    private String raca;
    private Filiacao filiacao;
    private Proprietario proprietario;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Filiacao getFiliacao() {
        return filiacao;
    }

    public void setFiliacao(Filiacao filiacao) {
        this.filiacao = filiacao;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }

    public Cachorro(String codigo, String nome, String raca, Filiacao filiacao, Proprietario proprietario) {
        this.codigo = codigo;
        this.nome = nome;
        this.raca = raca;
        this.filiacao = filiacao;
        this.proprietario = proprietario;
    }
 public String toString(){
     return "\n *****DADOS DO CACHORRO******"+
             "\n Codigo: "+getCodigo()+
             "\n Nome: "+getNome()+
             "\n Raça: "+getRaca()+
             "\n *****FILIAÇÃO DO CACHORRO****: "+getFiliacao()+
             "\n ****PROPRIETÁRIO DO CACHORRO****: "+getProprietario();
 }   
}
