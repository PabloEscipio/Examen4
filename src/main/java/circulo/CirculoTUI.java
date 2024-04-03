package circulo;

import java.util.Scanner;

/**
 * Clase para interactuar con el programa
 */
public class CirculoTUI {
    // Scanner
    public static Scanner sc = new Scanner(System.in);

    // circulo.circulo utilizado
    public static Circulo circulo = new Circulo(0);

    // main
    public static void main(String[] args) {
        // Variables
        byte uIndice = -1;
        // Programa
        do {
            try {
                indice();
                uIndice = Byte.parseByte(sc.nextLine());

                switch (uIndice) {
                    case 0 -> System.out.println("Cerrando programa...");
                    case 1 -> {
                        circulo.setRadio(pedirRadio());
                        System.out.println("Nuevo radio: " + circulo.getRadio());
                    }
                    case 2 -> System.out.println(circulo.diametro());
                    case 3 -> System.out.println(circulo.superficie());
                    case 4 -> System.out.println(circulo.longitud());
                    case 5 -> comprobarCuartoSuperficie50();
                    default -> System.out.println("Indice introducido no valido");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while (uIndice != 0);
        sc.close(); // Cerramos el Scanner
    }

    // Metodos
    // Indice
    public static void indice() {
        System.out.println("""
                ***** INDICE *****
                1\tAsignar nuevo radio al círculo.
                2\tCalcular diametro.
                3\tCalcular superficie.
                4\tCalcular longitud.
                5\tComprobar si un cuarto de la superficie es superior a 50.
                0\tCerrar programa.
                """);
    }

    // Pedir al Usuario
    public static int pedirRadio() {
        System.out.println("Introduce un radio entero positivo");
        return Integer.parseInt(sc.nextLine());
    }

    // comprobarCuartoSuperficie50
    public static void comprobarCuartoSuperficie50() {
        if (circulo.cuartaParteSuperficie50()) {
            System.out.println("Es superior a 50");
        } else {
            System.out.println("Es inferior a 50");
        }
    }
}
