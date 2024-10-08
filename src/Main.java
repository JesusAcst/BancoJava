import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nombre = "Tony Stark";
        String tipoDeCuenta = "Corriente";
        double saldo = 1599.99;
        int opcion=0;

        System.out.println("**********************");
        System.out.println("\nNombre del cliente: "+nombre);
        System.out.println("El tipo de cuenta es: "+tipoDeCuenta);
        System.out.println("Su saldo es: "+saldo+"$");
        System.out.println("\n**********************");

        String menu = """
                **** Esccriba el numero de la opcion deseada ****
                1 - Consultar saldo
                2 - Retirar
                3 - Depositar
                9 - Salir
                """;

        Scanner entrada = new Scanner(System.in);
        while (opcion!=9){
            System.out.println(menu);
            opcion = entrada.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("El saldo actualizado es: "+saldo);
                    break;
                case 2:
                    System.out.println("¿Cual es el valor que desea retirar?");
                    double valorRetirar = entrada.nextDouble();
                        if (valorRetirar > saldo){
                            System.out.println("Saldo insuficiente");
                        }else{
                            saldo = saldo-valorRetirar;
                            System.out.println("El saldo actualizado es: "+saldo);
                        }
                    break;
                case 3:
                    System.out.println("¿Cual es el valor que desea Depositar?");
                    double valorADepositar = entrada.nextDouble();
                    saldo += valorADepositar;
                    System.out.println("El saldo actualizado es: "+saldo);
                    break;
                case 9:
                    System.out.println("Gracias por usar nuestros servicios.");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        }


    }
}