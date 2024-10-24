public class Ex1 {
    public static void main(String[] args) {
        System.out.println(fatorial(3));
        System.out.println(fibonacci(7));
    }

    public static long fatorial(long numero) {
        long total = 1;
        for (int i = 2; i <= numero; i++) {
            total *= i;
        }
        return total;
    }

    public static long fibonacci(long posicao) {
        int enesimo = 0;
        int anterior = 0;

        for (int i = 1; i <= posicao; i++) {
            if (i == 1) {
                enesimo = 1;
                anterior = 0;
            } else {
                enesimo += anterior;
                anterior = enesimo - anterior;
            }
        }
        return enesimo;
    }
}