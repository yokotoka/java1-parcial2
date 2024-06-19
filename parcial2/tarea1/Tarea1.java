import java.util.Random;
import java.util.Scanner;

public class Tarea1 {
    private static final int NUM_STUDENTS = 10;

    public static void main(String[] args) {
        String[] nombres = new String[NUM_STUDENTS];
        int[] notas = new int[NUM_STUDENTS];
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int aprobadas = 0, promocionadas = 0, desaprobadas = 0;
        int maxNota = 0;
        String maxNombre = "";
        int sumNotas = 0;

        for (int i = 0; i < NUM_STUDENTS; i++) {
            System.out.print("Ingrese el nombre del estudiante " + (i + 1) + ": ");
            nombres[i] = scanner.nextLine();
            notas[i] = random.nextInt(10) + 1;

            sumNotas += notas[i];
            if (notas[i] >= 4) {
                aprobadas++;
            }
            else if (notas[i] >= 7) {
                promocionadas++;
            }
            else if (notas[i] < 4) {
                desaprobadas++;
            }

            if (notas[i] > maxNota) {
                maxNota = notas[i];
                maxNombre = nombres[i];
            } else if (notas[i] == maxNota) {
                maxNombre += ", " + nombres[i];
            }
        }

        System.out.println("Cantidad de notas aprobadas: " + aprobadas);
        System.out.println("Cantidad de notas promocionadas: " + promocionadas);
        System.out.println("Cantidad de notas desaprobadas: " + desaprobadas);
        System.out.println("Nota más alta: " + maxNota + ", Nombre(s) del alumno con la nota más alta: " + maxNombre);
        System.out.println("Promedio general de las notas: " + (double) sumNotas / NUM_STUDENTS);
    }
}
