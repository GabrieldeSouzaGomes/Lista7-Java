//7) Escreva um programa que apresente a série de Fibonacci até o décimo quinto termo.
//A série de Fibonacci é formada pela sequência: 1, 1, 2, 3, 5, 8, 13, 21, 34, ..., etc.
//Esta série se caracteriza pela soma de um termo atual com o seu anterior subsequente,
//para que seja formado o próximo valor da sequência. Portanto começando com os números 
//1, 1 o próximo termo é 1+1=2, o próximo é 1+2=3, o próximo é 2+3=5, o próximo 3+5=8, etc.
package lista07;

public class ExercicioDoWhileFibonacci07 {

    public static void main(String[] args) {
        int termo1 = 1;
        int termo2 = 1;
        int contador = 2; // Já temos dois termos definidos
        int proximo;

        System.out.print("Série de Fibonacci até o 15º termo:\n");
        System.out.print(termo1 + ", " + termo2);

        do {
            proximo = termo1 + termo2;
            System.out.print(", " + proximo);

            termo1 = termo2;
            termo2 = proximo;
            contador++;
        } while (contador < 15);

        System.out.println(); // Quebra de linha ao final
    }
}

