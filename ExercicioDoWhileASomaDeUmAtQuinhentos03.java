//3) Elaborar um programa que apresente no final o somatório dos valores pares existentes na faixa de 1 até 500.
package lista07;

public class ExercicioDoWhileASomaDeUmAtQuinhentos03 {

    public static void main(String[] args) {
        int numero = 1;
        int soma = 0;

        do {
            if (numero % 2 == 0) {
                soma += numero;
            }
            numero++;
        } while (numero <= 500);

        System.out.println("A soma dos valores pares de 1 até 500 é: " + soma);
    }
}
