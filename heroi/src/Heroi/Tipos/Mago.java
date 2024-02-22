package Heroi.Tipos;

import Heroi.NovoHeroi;

public class Mago extends NovoHeroi {

    public static final String TIPO = "Mago";
    public static final String ATAQUE = "Magia";

    public Mago(String nome, Integer idade) {
        super(nome, idade, TIPO);
    }

    public void atacar(){
        System.out.println("O " + TIPO + " atacou usando " + ATAQUE);
    }
    
}
