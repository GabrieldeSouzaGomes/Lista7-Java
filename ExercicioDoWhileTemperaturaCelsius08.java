// Elaborar um programa que apresente os valores de conversão de graus Celsius em Fahrenheit,
//de 10 em 10 graus, iniciando a contagem em 10 graus Celsius e finalizando em 100 graus Celsius.
//O programa deve apresentar os valores das duas temperaturas. A fórmula de conversão é 5 9 +160 = C F ,
//sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.
package lista07;

public class ExercicioDoWhileTemperaturaCelsius08 {

    public static void main(String[] args) {
        int celsius = 10;
        double fahrenheit;

        System.out.println("Celsius\t|\tFahrenheit");
        System.out.println("-----------------------------");

        do {
            fahrenheit = (9 * celsius + 160.0) / 5;
            System.out.println(celsius + "\t|\t" + fahrenheit);
            celsius += 10;
        } while (celsius <= 100);
    }
}

