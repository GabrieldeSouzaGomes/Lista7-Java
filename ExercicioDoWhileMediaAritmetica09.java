//9) Elaborar um programa que efetue a leitura de 10 valores numéricos e
//apresente no final o total do somatório e a média aritmética dos valores lidos.
package lista07;

import java.util.Scanner;

public class ExercicioDoWhileMediaAritmetica09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 1;
        double numero, soma = 0;
        double media;

        System.out.println("Digite 10 números:");

        do {
            System.out.print("Número " + contador + ": ");
            numero = scanner.nextDouble();
            soma += numero;
            contador++;
        } while (contador <= 10);

        media = soma / 10;

        System.out.println("\nSomatório dos valores: " + soma);
        System.out.println("Média aritmética: " + media);

        scanner.close();
    }
}
