package Heroi;

public class NovoHeroi {
    private String nome,tipo,atacar;
    private Integer idade;

    public NovoHeroi(String nome, Integer idade, String tipo, String atacar){
        this.nome   = nome;
        this.idade  = idade;
        this.tipo   = tipo;
        this.atacar = atacar;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome){
        this.nome=nome;
    }

    public Integer getIdade(){
        return this.idade;
    }

    public void SetIdade(Integer idade){
        this.idade=idade;

    }

    public String getTipo(){
        return this.tipo;
    }

    public void SetTipo(String Tipo){
        this.tipo=Tipo;
    }

    public String getatacar(){
        return this.atacar;
    }

    public void SetAtacar(String Atacar){
        this.atacar= Atacar;
    }

}
