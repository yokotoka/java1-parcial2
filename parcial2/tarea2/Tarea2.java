import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tarea2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la distancia al destino: ");
        int distancia = scanner.nextInt();
        scanner.nextLine(); // Consumir nueva línea
        int paso = 100;
        String direccion = "adelante";
        int actual = 0;
        List<String[]> resultado = new ArrayList<>();

        while (actual >= 0) {
            actual += paso;
            if (actual > distancia) { // cambiar dirección
                actual = distancia - (actual - distancia);
                paso *= -1;
                direccion = "atrás";
            }
            if (actual < 0) {
                break;
            }
            System.out.print("Ingrese el nombre de la parada en el km " + actual + " en dirección " + direccion + ": ");
            String nombreParada = scanner.nextLine();
            resultado.add(new String[]{nombreParada, String.valueOf(actual), direccion});
        }

        if (resultado.isEmpty()) {
            System.out.println("No se requiere reabastecimiento");
        } else {
            for (String[] res : resultado) {
                System.out.println("Reabastecido en " + res[0] + " " + res[1] + " km en dirección " + res[2]);
            }
        }
    }
}
