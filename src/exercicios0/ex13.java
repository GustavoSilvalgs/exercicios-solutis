package exercicios0;

public class ex13 {
    public static void main(String[] args) {

        System.out.println("Possibilidades da soma ser = 7 no lançamento do dois dados:");
        for (int dado1 = 1; dado1 <= 6; dado1++) {
            for (int dado2 = 1; dado2 <= 6; dado2++) {
                if (dado1 + dado2 == 7) {
                    System.out.println("Dado 1 = " + dado1 + ", Dado 2 = " + dado2);
                }
            }
        }
    }
}
