import java.util.Scanner;

/**
 * Actividad: Ejercicios POO - Parte 2
 * Alumno: Yire Quintero Hernández
 * No. Control: 251190103
 * Institución: TecNM Campus Milpa Alta II
 */

// 1. CLASE VALIDADOR DE NÚMEROS ENTEROS
class ValidadorEntero {
    private String entrada;

    public ValidadorEntero(String entrada) {
        this.entrada = entrada;
    }

    public boolean esEnteroValido() {
        if (entrada == null || entrada.isEmpty()) {
            return false;
        }
        try {
            Integer.parseInt(entrada);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}

// 2. CLASE CÍRCULO (CÁLCULO DE ÁREA)
class Circulo {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2); // Corregido sin "b:"
    }

    public double getRadio() {
        return radio;
    }
}

// CLASE PRINCIPAL DE PRUEBAS (MAIN)
public class EjerciciosParte2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("   PRÁCTICA DE POO - PARTE 2            ");
        System.out.println("========================================\n");

        // --- PRUEBA 1: Validación de número entero ---
        System.out.println("--- EJERCICIO 1: VALIDAR NÚMERO ENTERO ---");
        System.out.print("Ingrese un valor para comprobar si es entero: ");
        String textoIngresado = scanner.nextLine();

        ValidadorEntero validador = new ValidadorEntero(textoIngresado);
        if (validador.esEnteroValido()) {
            System.out.println("Resultado: ¡Correcto! \"" + textoIngresado + "\" SÍ es un número entero válido.\n");
        } else {
            System.out.println("Resultado: Falso. \"" + textoIngresado + "\" NO es un número entero válido.\n");
        }

        // --- PRUEBA 2: Área del círculo ---
        System.out.println("--- EJERCICIO 2: ÁREA DEL CÍRCULO ---");
        System.out.print("Ingrese el radio del círculo: ");
        double radioIngresado = scanner.nextDouble();

        Circulo circulo = new Circulo(radioIngresado);
        System.out.println("Radio ingresado: " + circulo.getRadio());
        System.out.printf("Área calculada: %.4f unidades cuadradas\n", circulo.calcularArea());

        scanner.close();
    }
}
