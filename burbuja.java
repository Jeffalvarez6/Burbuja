import java.util.Arrays;

/**
 * Método de Ordenamiento Burbuja (Bubble Sort)
 * Ordena un arreglo de menor a mayor y muestra cada pasada.
 */
public class Burbuja {

    public static int[] ordenamientoBurbuja(int[] arreglo, boolean mostrarPasos) {
        int[] datos = arreglo.clone();   // Copia para no modificar el original
        int n = datos.length;

        for (int i = 0; i < n - 1; i++) {          // Número de pasadas
            boolean huboIntercambio = false;

            for (int j = 0; j < n - 1 - i; j++) {  // Compara elementos vecinos
                if (datos[j] > datos[j + 1]) {
                    int temp = datos[j];           // Intercambio
                    datos[j] = datos[j + 1];
                    datos[j + 1] = temp;
                    huboIntercambio = true;
                }
            }

            if (mostrarPasos) {
                System.out.println("Pasada " + (i + 1) + ": " + Arrays.toString(datos));
            }

            if (!huboIntercambio) {   // Si no hubo cambios, ya está ordenado
                break;
            }
        }
        return datos;
    }

    public static void main(String[] args) {
        int[] numeros = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("=== MÉTODO BURBUJA ===");
        System.out.println("Arreglo original: " + Arrays.toString(numeros) + "\n");

        int[] resultado = ordenamientoBurbuja(numeros, true);

        System.out.println("\nArreglo ordenado: " + Arrays.toString(resultado));
    }
}