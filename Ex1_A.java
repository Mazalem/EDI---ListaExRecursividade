public class Ex1_A {
    public static void main(String[] args) {
        try {
            System.out.println(fatorial(-1));
        }
        catch(Exception ex) {
            System.err.println(ex.getMessage());
        }
    }

    public static long fatorial(long numero) throws Exception {
        if(numero < 0) {
            throw new Exception("Não existe fatorial de número negativo!");
        }
        long total = 1;
        for (int i = 2; i <= numero; i++) {
            total *= i;
        }
        return total;
    }
}