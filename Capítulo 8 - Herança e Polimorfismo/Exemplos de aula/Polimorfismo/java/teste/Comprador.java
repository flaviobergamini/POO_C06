package teste;

import org.example.Brownie;
import org.example.BrownieNutella;

public class Comprador {
    public void compraBrownie(Brownie brownie) {
        System.out.println("Comprou um brownie: " + brownie.getNome());

        if (brownie instanceof BrownieNutella) {
            BrownieNutella nutella = (BrownieNutella) brownie;
            nutella.adicionaNutella();
        }
    }
}
