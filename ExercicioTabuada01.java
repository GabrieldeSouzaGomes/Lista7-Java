//1) Apresentar os resultados de uma tabuada de multiplicar (de 1 até 10) de um número qualquer.
package lista07;

import java.util.Scanner;

public class ExercicioTabuada01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para ver a tabuada de multiplicação: ");
        int numero = scanner.nextInt(); // Lê o número informado pelo usuário

        System.out.println("\nTabuada do " + numero + ":");

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        scanner.close(); // Fecha o scanner para liberar recursos
    }
} 


