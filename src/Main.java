/**
 * Classe principal del programa. Mostra l'ús de la classe {@link Calculadora}
 * executant diverses operacions matemàtiques bàsiques i avançades.
 */
public class Main {
    
    /**
     * Punt d'entrada del programa. Crea una instància de {@code Calculadora}
     * i mostra per consola els resultats de diverses operacions.
     *
     * @param args Arguments de la línia de comandes (no s'utilitzen en aquest programa).
     */
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        // Operaciones básicas
        System.out.println("Suma: " + calculadora.getBasicas().sumar(5, 3));
        System.out.println("Resta: " + calculadora.getBasicas().restar(10, 4));
        System.out.println("Multiplicación: " + calculadora.getBasicas().multiplicar(6, 7));
        System.out.println("División: " + calculadora.getBasicas().dividir(20, 5));

        // Operaciones avanzadas
        System.out.println("Potencia: " + calculadora.getAvanzadas().potencia(2, 3));
        System.out.println("Raíz cuadrada: " + calculadora.getAvanzadas().raizCuadrada(25));
        System.out.println("Módulo: " + calculadora.getAvanzadas().modulo(10, 3));
        System.out.println("Valor absoluto: " + calculadora.getAvanzadas().valorAbsoluto(-7.5));
    }
}
