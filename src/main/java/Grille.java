public interface Grille {
    ValeurDeCase getValeur(int x, int y) throws GrilleException;
    void setValeur(int x, int y, ValeurDeCase valeur) throws GrilleException;
    boolean estValide();
}
