import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GrilleTest {

  private Grille grille;

  @BeforeEach
  public void setUp() {
    // GrilleImpl sera une implémentation vide pour l'instant
    grille = new GrilleImpl(); // Implémentation vide de Grille
  }

  @Test
  public void testGetValeur() throws GrilleException {
    // On suppose que la méthode renverra null (car l'implémentation est vide)
    assertNull(grille.getValeur(0, 0));
  }

  @Test
  public void testSetValeur() throws GrilleException {
    ValeurDeCase valeur = new ValeurDeCaseAsChar('5'); // Valeur fictive
    grille.setValeur(0, 0, valeur);
    assertEquals('5', grille.getValeur(0, 0).getValeur());
  }

  @Test
  public void testEstValide() throws GrilleException {
    // On suppose que la méthode renverra toujours true (car l'implémentation est vide)
    assertTrue(grille.estValide());
  }
}
