public class Ex3 {
    public static void main(String[] args) {
        System.out.println(primo(3));
        System.out.println(primo(9));
    }

    public static boolean verificaDivisor(int numero, int divisor) {
        if(divisor == 1){
            return true;
        }else if(numero % divisor == 0) {
            return false;
        }
        else {
            return verificaDivisor(numero, divisor-1);
        }
    }

    public static boolean primo(int numero) {
        if(numero < 2){
            return false;
        }
        else {
            return verificaDivisor(numero, numero-1);
        }
    }
}