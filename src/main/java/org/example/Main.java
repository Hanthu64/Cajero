package org.example;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldo = 1000;
        double cantidad = 0;
        int opcion = -1;

        System.out.println("BIENVENIDO AL CAJERO AUTOMÁTICO");
        while(opcion != 0){
            System.out.println("SALDO ACTUAL: " + saldo + "€.");
            System.out.println("Introduzca una opción:");
            System.out.println("------------------------");
            System.out.println("1.- Retirar fondos");
            System.out.println("2.- Ingresar fondos");
            System.out.println("0.- Salir");
            opcion = sc.nextInt();
            switch (opcion){
                case 0:
                    System.out.println("¡Ten un buen día!");
                break;
                case 1:
                    System.out.println("¿Cuántos fondos quieres retirar?");
                    cantidad = sc.nextDouble();
                    saldo = sacarFondos(saldo, cantidad);
                break;
                case 2:
                    System.out.println("¿Cuántos fondos quieres ingresar?");
                    cantidad = sc.nextDouble();
                    saldo = ingresarFondos(saldo, cantidad);
                break;
            }
        }
    }

    static double sacarFondos(double a, double b){
        if (b >= 0) {
            if ((a - b) >= 0){
                a = a - b;
            }else{
                System.out.println("¡Para el carro! No tienes esa cantidad de dinero. Operación cancelada.");
            }
        }else{
            System.out.println("¿Quizá querías meter dinero? Operación cancelada.");
        }
        return a;
    }

    static double ingresarFondos(double a, double b){
        if (b >= 0) {
            a = a + b;
        }else{
            System.out.println("¿Quizá querías sacar dinero? Operación cancelada.");
        }
        return a;
    }
}