import Heroi.Tipos.Guerreiro;
import Heroi.Tipos.Mago;
import Heroi.Tipos.Monge;
import Heroi.Tipos.Ninja;

public class App {
    public static void main(String [] args){
        System.out.println("Hello, World!");

        Mago mago = new Mago("Luiz", 38);
        mago.atacar();

        Guerreiro guerreiro = new Guerreiro("Isabele", 12);
        guerreiro.atacar(); 

        Ninja ninja = new Ninja ("Ieleny",28);
        ninja.atacar();

        Monge monge = new Monge ( "Isabele", 12);
        monge.atacar();

    }
    
}
