//2) Apresentar o total da soma obtida dos cem primeiros números inteiros (1+2+3+4+...+98+99+100).
package lista07;

public class ExemploDoWhileNumerosInteiros02 {

    public static void main(String[] args) {
        int contador = 1;
        int soma = 0;

        do {
            soma += contador;
            contador++;
        } while (contador <= 100);

        System.out.println("A soma dos 100 primeiros números inteiros é: " + soma);
    }
}
