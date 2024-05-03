
import java.util.Scanner;

public class CalculadoraApp {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        System.out.println("*****Aplicacion de calculadora*****");

        while (true) {
            //Funcion que muestra el menu
            mostrarMenu();

            try {
                var operacion = Integer.parseInt(consola.nextLine());
                //Revisar que este dentro de las opciones mencionadas
                if (operacion >= 1 && operacion <= 4) {
                    //Ejecutamos la operacion deseada
                    ejecutarOperacion(operacion, consola);

                } else if (operacion == 5) {
                    System.out.println("Hasta Pronto...");
                    break;

                } else {
                    System.out.println("Operacion erronea ---> " + operacion);
                }
                System.out.println("\n");
            }//fin Try
            catch (NumberFormatException e) {
                System.out.println("Ocurrio un error: " + e.getMessage());
            }
        }//cierre while
    }//cierre main

    public static void mostrarMenu() {
        System.out.println("""
                           1.Suma
                           2.Resta
                           3.Multiplicacion
                           4.Division
                           5.Salir                           
                           """);
        System.out.print("¿Operacion a realizar?");
    }

    private static void ejecutarOperacion(int operacion, Scanner consola) {
        System.out.print("proporciona valor operando1 ");
        var operador1 = Double.parseDouble(consola.nextLine());
        System.out.print("proporciona valor operando2 ");
        var operador2 = Double.parseDouble(consola.nextLine());

        double resultado;

        switch (operacion) {
            case 1 -> {
                resultado = operador1 + operador2;
                System.out.println("Resultado Suma: " + resultado);

            }
            case 2 -> {
                resultado = operador1 - operador2;
                System.out.println("Resultado Resta: " + resultado);

            }
            case 3 -> {
                resultado = operador1 * operador2;
                System.out.println("Resultado Multiplicacion: " + resultado);

            }
            case 4 -> {
                resultado = operador1 / operador2;
                System.out.println("Resultado Division : " + resultado);

            }
            default ->
                System.out.println("Opcion erronea " + operacion);

        }

    }
}//cierre class 
