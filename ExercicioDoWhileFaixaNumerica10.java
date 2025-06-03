//10) Elaborar um programa que apresente os resultados da soma
//e da média aritmética dos valores pares situados na faixa numérica de 50 a 70.
package lista07;

public class ExercicioDoWhileFaixaNumerica10 {

    public static void main(String[] args) {
        int numero = 50;
        int soma = 0;
        int contador = 0;

        do {
            if (numero % 2 == 0) {
                soma += numero;
                contador++;
            }
            numero++;
        } while (numero <= 70);

        double media = (double) soma / contador;

        System.out.println("Soma dos valores pares entre 50 e 70: " + soma);
        System.out.println("Média aritmética: " + media);
    }
}
