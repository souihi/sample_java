import org.example.Calculatrice;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatriceTest {
    @Test
    public void testAdd() {
        Calculatrice calculatrice = new Calculatrice();
        assertEquals(Integer.valueOf(5), calculatrice.add(2, 3)); // Tester l'addition de deux nombres positifs
        assertEquals(Integer.valueOf(-1), calculatrice.add(2, -3)); // Tester l'addition d'un nombre positif et d'un nombre négatif
    }

    @Test
    public void testSubstract() {
        Calculatrice calculatrice = new Calculatrice();
        assertEquals(Integer.valueOf(-1), calculatrice.substract(2, 3)); // Tester la soustraction de deux nombres positifs
        assertEquals(Integer.valueOf(5), calculatrice.substract(8, 3)); // Tester la soustraction d'un nombre positif et d'un nombre plus petit
    }

    @Test
    public void testDivide() {
        Calculatrice calculatrice = new Calculatrice();
        assertEquals(Integer.valueOf(2), calculatrice.divise(6, 3)); // Tester la division de deux nombres positifs
        assertEquals(Integer.valueOf(0), calculatrice.divise(0, 5)); // Tester la division par zéro
        // Ajoutez d'autres cas de test ici
    }

    @Test
    public void testMultiply() {
        Calculatrice calculatrice = new Calculatrice();
        assertEquals(Integer.valueOf(6), calculatrice.multiply(2, 3)); // Tester la multiplication de deux nombres positifs
        assertEquals(Integer.valueOf(-15), calculatrice.multiply(3, -5)); // Tester la multiplication d'un nombre positif et d'un nombre négatif
        // Ajoutez d'autres cas de test ici
    }
}
