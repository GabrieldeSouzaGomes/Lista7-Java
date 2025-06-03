//Elaborar um programa que apresente como resultado o valor de uma potência 
//de uma base qualquer elevada a um expoente qualquer, ou seja, de BE, em que B é o 
//valor da base e E o valor do expoente. Observe que neste exercício não pode ser utilizado o operador de exponenciação do portuguol (^)
package lista07;

import java.util.Scanner;

public class ExercicioDoWhileExpressaoPortugol06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a base: ");
        int base = scanner.nextInt();

        System.out.print("Digite o expoente (inteiro não-negativo): ");
        int expoente = scanner.nextInt();

        long resultado = 1;
        int contador = 0;

        // Calcula a potência usando do...while
        do {
            resultado *= base;
            contador++;
        } while (contador < expoente);

        System.out.println(base + "^" + expoente + " = " + resultado);

        scanner.close();
    }
}

