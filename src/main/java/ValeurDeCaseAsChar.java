/**
 * Classe ValeurDeCaseAsChar représentant chaque élément par un caractère.
 *
 *@author MAWABO BELINDA
 *@version 1.0
 */

public class ValeurDeCaseAsChar implements ValeurDeCase {
  private char valeur;
  
  /** Constructeur. 
   *
   * @param valeur
   **/
  public ValeurDeCaseAsChar(char valeur) {
    this.valeur = valeur;
  }

  /** 
   * retourne la valeur de la case sous forme de caractère.
   *
   * @return Le caractère représentant la valeur de la case
   */
  @Override
  public char getValeur() {
    return this.valeur;
  }
  
  /** 
   * retourne la valeur de la case sous forme de caractère.
   *
   * @return Le caractère représentant la valeur de la case
   */	
  @Override
  public String toString() {
    return String.valueOf(this.valeur);
  }
}




