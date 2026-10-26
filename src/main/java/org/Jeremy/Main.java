package org.Jeremy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalRegistrados = 0;
        int estudiantesAprobados = 0;
        int estudiantesReprobados = 0;
        double sumaPromediosTotales = 0;
        int opcion = 0;
        do {
            System.out.println("=====================================");
            System.out.println(" CONTROL DE CALIFICACIONES");
            System.out.println("=====================================");
            System.out.println("1. Registrar calificaciones");
            System.out.println("2. Mostrar estadísticas");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            System.out.println();
            switch (opcion) {
                case 1:
                    System.out.println("=====================================");
                    System.out.println(" REGISTRAR ESTUDIANTE");
                    System.out.println("=====================================");
                    System.out.print("¿Cuántos estudiantes registrará?: ");
                    int n = scanner.nextInt();
                    scanner.nextLine();
                    for (int i = 0; i < n; i++) {
                        System.out.println("-------------------------------------");
                        System.out.println("Estudiante " + (i + 1));
                        System.out.println("-------------------------------------");
                        System.out.print("Nombre: ");
                        String nombre = scanner.nextLine();
                        System.out.print("Evaluación 1: ");
                        double ev1 = scanner.nextDouble();
                        System.out.print("Evaluación 2: ");
                        double ev2 = scanner.nextDouble();
                        System.out.print("Evaluación 3: ");
                        double ev3 = scanner.nextDouble();
                        scanner.nextLine();
                        double promedio = (ev1 + ev2 + ev3) / 3.0;
                        String resultado;
                        if (promedio >= 6.0) {
                            resultado = "APROBADO";
                            estudiantesAprobados++;
                        } else {
                            resultado = "REPROBADO";
                            estudiantesReprobados++;
                        }
                        totalRegistrados++;
                        sumaPromediosTotales += promedio;
                        System.out.printf("Promedio: %.2f\n", promedio);
                        System.out.println("Resultado: " + resultado);
                    }
                    System.out.println("-------------------------------------");
                    break;
                case 2:
                    System.out.println("=====================================");
                    System.out.println(" ESTADÍSTICAS DEL GRUPO");
                    System.out.println("=====================================");

                    if (totalRegistrados == 0) {
                        System.out.println("No hay estudiantes registrados todavía.");
                    } else {
                        double promedioGeneral = sumaPromediosTotales / totalRegistrados;
                        System.out.println("Estudiantes registrados: " + totalRegistrados);
                        System.out.println("Estudiantes aprobados: " + estudiantesAprobados);
                        System.out.println("Estudiantes reprobados: " + estudiantesReprobados);
                        System.out.printf("Promedio general: %.2f\n", promedioGeneral);
                    }
                    System.out.println("=====================================");
                    break;
                case 3:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
            System.out.println();
        } while (opcion != 3);
        scanner.close();
    }
}