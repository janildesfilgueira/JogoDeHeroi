import Heroi.Tipos.Guerreiro;
import Heroi.Tipos.Mago;

public class App {
    public static void main(String [] args){
        System.out.println("Hello, World!");

        Mago mago = new Mago("Luiz", 38);
        mago.atacar();

        Guerreiro guerreiro = new Guerreiro("Isabele", 12);
        guerreiro.atacar(); 
    }
    
}
