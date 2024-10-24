public class Ex3 {
    public static void main(String[] args) {
        try {
            System.out.println(primo(3));
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }

    }

    public static boolean verificaDivisor(int numero, int divisor) {
        if (divisor == 1) {
            return true;
        } else if (numero % divisor == 0) {
            return false;
        } else {
            return verificaDivisor(numero, divisor - 1);
        }
    }

    public static boolean primo(int numero) throws Exception {
        if (numero < 0) {
            throw new Exception("Não existe primo negativo!");
        }
        if (numero < 2) {
            return false;
        } else {
            return verificaDivisor(numero, numero - 1);
        }
    }
}