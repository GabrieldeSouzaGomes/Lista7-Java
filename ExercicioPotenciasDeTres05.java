// 
package lista07;

public class ExercicioPotenciasDeTres05 {

    public static void main(String[] args) {
        int base = 3;
        long resultado = 1; // Começa com 3^0 = 1

        for (int expoente = 0; expoente <= 15; expoente++) {
            System.out.println("3^" + expoente + " = " + resultado);
            resultado *= base; // Multiplica pela base para próxima potência
        }
    }
}

