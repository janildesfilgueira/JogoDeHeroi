package Heroi.Tipos;

import Heroi.NovoHeroi;

public class Monge extends NovoHeroi {
    public static final String TIPO = "Monge";
    public static final String ATAQUE= "Artes marciais";

    public Monge (String nome, Integer idade) {
        super (nome, idade ,TIPO);
}
    public void atacar(){
       System.out.println("O " + TIPO + " atacou usando " + ATAQUE);
    }


}
