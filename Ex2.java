public class Ex2 {
    public static void main(String[] args) {
        System.out.println(potencia(5));
    }

    public static int potencia(int expoente) {
        if(expoente == 0)
            return 1;
        else
            return 2*potencia(expoente - 1);
    }
}