package Heroi.Tipos;

import Heroi.NovoHeroi;

public class Guerreiro extends NovoHeroi {

    public static final String TIPO = "GUERREIRO";
    public static final String ATAQUE = "Espada";

    public Guerreiro(String nome, Integer idade) {
        super(nome, idade, TIPO);     
    }
    
    public void atacar(){
        System.out.println("O " + TIPO + " atacou usando " + ATAQUE);
    }
    
}
