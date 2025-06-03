//12) Elaborar um programa que efetue a leitura de valores positivos inteirosaté que um
//valor negativo seja informado. Ao final devem ser apresentados o maior e o menor valores informados pelo usuário.
package lista07;

import java.util.Scanner;

public class ExercicioDoWhileValoresPositivosInteiros12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valor;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        do {
            System.out.print("Digite um valor positivo (ou um valor negativo para encerrar): ");
            valor = scanner.nextInt();

            if (valor >= 0) {
                if (valor > maior) {
                    maior = valor;
                }
                if (valor < menor) {
                    menor = valor;
                }
            }

        } while (valor >= 0);

        if (maior == Integer.MIN_VALUE || menor == Integer.MAX_VALUE) {
            System.out.println("Nenhum valor positivo foi informado.");
        } else {
            System.out.println("Maior valor informado: " + maior);
            System.out.println("Menor valor informado: " + menor);
        }

        scanner.close();
    }
}

