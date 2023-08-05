package exercicios0;

public class Ex12 {
    public static void main(String[] args) {

        System.out.println("Resultados usando int:");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                int result = i / 2;
                System.out.println("Divisão por 2 de " + i + " = " + result);
            }
        }

        System.out.println("\nResultados usando double:");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                double result = (double) i / 2;
                System.out.println("Divisão por 2 de " + i + " = " + result);
            }
        }
    }
}
