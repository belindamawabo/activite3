/**
 * Classe GrilleImpl implementant la grille.
 *
 *@author MAWABO BELINDA
 *@version 1.0
 */


public class GrilleImpl implements Grille {
  private ValeurDeCase[][] grille;
  
  /** 
   * Constructeur de la classe GrilleImpl. 
   *
   * Ce constructeur initialise une grille de Sudoku vide (9x9), avec toutes les cases initialisées à null.
   * Il crée un tableau 2D de type ValeurDeCase de dimensions 9x9.
   */
  public GrilleImpl() {
    grille = new ValeurDeCase[9][9]; 
  }
  
  /** 
   * Récupère la valeur d'une case dans la grille.
   *
   * Cette méthode permet d'obtenir la valeur d'une case en spécifiant les indices x et y.
   * Elle jette une exception GrilleException si les indices sont hors des limites de la grille.
   *
   * @param x La position en ligne de la case (indexée de 0 à 8)
   * @param y La position en colonne de la case (indexée de 0 à 8)
   * @return La valeur de la case à la position (x, y)
   * @throws GrilleException Si les coordonnées (x, y) sont hors des limites de la grille
   */
  @Override
  public ValeurDeCase getValeur(int x, int y) throws GrilleException {
    if (x < 0 || x >= 9 || y < 0 || y >= 9) {
      throw new GrilleException("Coordonnées hors limites");
    }
    return grille[x][y];
  }

  /** 
   * Définit la valeur d'une case dans la grille.
   *
   * Cette méthode permet de modifier la valeur d'une case en spécifiant les indices x et y,
   * ainsi que la nouvelle valeur à y insérer.
   * Elle jette une exception GrilleException si les indices sont hors des limites de la grille.
   *
   * @param x La position en ligne de la case (indexée de 0 à 8)
   * @param y La position en colonne de la case (indexée de 0 à 8)
   * @param valeur La valeur à assigner à la case à la position (x, y)
   * @throws GrilleException Si les coordonnées (x, y) sont hors des limites de la grille
   */
  @Override
  public void setValeur(int x, int y, ValeurDeCase valeur) throws GrilleException {
    if (x < 0 || x >= 9 || y < 0 || y >= 9) {
      throw new GrilleException("Coordonnées hors limites");
    }
    grille[x][y] = valeur;
  }

  /** 
   * Vérifie si la grille est valide.
   *
   * Cette méthode vérifie si la grille de Sudoku respecte les règles de validité (par exemple,
   * s'il n'y a pas de répétition de chiffres dans les lignes, colonnes, et sous-grilles 3x3).
   * Pour l'instant, cette méthode retourne toujours `true`, mais elle peut être améliorée pour
   * ajouter une vraie logique de validation.
   *
   * @return true si la grille est valide, sinon false
   */
  @Override
  public boolean estValide() {
    return true;
  }
}
