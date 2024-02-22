package Heroi;

public class NovoHeroi {
    private String nome,tipo;
    private Integer idade;

    public NovoHeroi(String nome, Integer idade, String tipo){
        this.nome   = nome;
        this.idade  = idade;
        this.tipo   = tipo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public Integer getIdade(){
        return this.idade;
    }

    public void SetIdade(Integer idade){
        this.idade = idade;

    }

    public String getTipo(){
        return this.tipo;
    }

    public void SetTipo(String Tipo){
        this.tipo = Tipo;
    }

    public void atacar(){
        System.out.println("O {tipo} atacou usando {ataque}");
    }

}
