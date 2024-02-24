package Heroi.Tipos;

import Heroi.NovoHeroi;

public class Ninja extends NovoHeroi {

    public static final String TIPO = "Ninja";
    public static final String ATAQUE = "Shuriken";

    public Ninja(String nome, Integer idade) {
        super(nome, idade, TIPO);     
    }
    
    public void atacar(){
        System.out.println("O " + TIPO + " atacou usando " + ATAQUE);
    }
    
}


 
    


