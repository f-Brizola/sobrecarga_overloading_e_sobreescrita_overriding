import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Teste {

    @Test
    public void testVaca() {
        Vaca vaca = new Vaca();
        System.out.println(vaca.emitirSom());
    }

    @Test
    public void testGato() {
        Gato gato = new Gato();
        System.out.println(gato.emitirSom());

    }

    @Test
    public void testCachorro1() {
        Cachorro cachorro = new Cachorro();
        cachorro.setNome("belinha");
        cachorro.setIdade(7);
        System.out.println(cachorro.getNome()+" "+ cachorro.getIdade() +" anos");
    }

    @Test
    public void testCachorro2() {
        Cachorro cachorro = new Cachorro();
        cachorro.Cachorro("bob");
        cachorro.setIdade(9);
        System.out.println(cachorro.getNome()+" "+ cachorro.getIdade() +" anos");
    }

    @Test
    public void testCachorro3() {
        Cachorro cachorro = new Cachorro();
        cachorro.Cachorro("lupita", 3);
        System.out.println(cachorro.getNome()+" "+ cachorro.getIdade() +" anos");
    }
}
