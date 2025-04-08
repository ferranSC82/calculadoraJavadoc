/**
 * Classe que representa una calculadora amb funcionalitats bàsiques i avançades.
 * Proporciona accés a les operacions mitjançant els seus respectius mòduls.
 */

public class Calculadora {
   
    /**
     * Mòdul per a operacions bàsiques com suma, resta, multiplicació i divisió.
     */
    private OperacionesBasicas basicas;

    /**
     * Mòdul per a operacions avançades com potències, arrels, etc.
     */
    private OperacionesAvanzadas avanzadas;

    /**
     * Crea una nova instància de {@code Calculadora} inicialitzant
     * els mòduls d'operacions bàsiques i avançades.
     */
    public Calculadora() {
        this.basicas = new OperacionesBasicas();
        this.avanzadas = new OperacionesAvanzadas();
    }

    /**
     * Retorna el mòdul d'operacions bàsiques.
     *
     * @return una instància de {@code OperacionesBasicas}
     */
    public OperacionesBasicas getBasicas() {
        return basicas;
    }

     /**
     * Retorna el mòdul d'operacions avançades.
     *
     * @return una instància de {@code OperacionesAvanzadas}
     */
    public OperacionesAvanzadas getAvanzadas() {
        return avanzadas;
    }
}