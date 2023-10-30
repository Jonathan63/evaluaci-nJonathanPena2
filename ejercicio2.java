import java.util.Scanner;


public class ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la fila de la posición de partida (1-8): ");
        int filaPartida = scanner.nextInt();

        System.out.print("Ingrese la columna de la posición de partida (1-8): ");
        int columnaPartida = scanner.nextInt();

        System.out.print("Ingrese la fila de la posición final (1-8): ");
        int filaFinal = scanner.nextInt();

        System.out.print("Ingrese la columna de la posición final (1-8): ");
        int columnaFinal = scanner.nextInt();

        // Verificar si el movimiento del alfil
        int diferenciaFilas = Math.abs(filaPartida - filaFinal);
        int diferenciaColumnas = Math.abs(columnaPartida - columnaFinal);

        if (diferenciaFilas == diferenciaColumnas) {
            System.out.println("El movimiento del alfil es válido.");
        } else {
            System.out.println("El movimiento del alfil no es válido.");
        }
        
    }
}
