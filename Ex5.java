public class Ex5 {
    public static void main(String[] args) {
        System.out.println(mdc(20,24));
    }

    public static int mdc(int numero1, int numero2) {
        if(numero1 < numero2) {
            int apoio = numero1;
            numero1 = numero2;
            numero2 = apoio;
        }
        if(numero1 >= numero2 && numero1 % numero2 == 0) {
            return numero2;
        }
        else {
            return mdc(numero2, numero1 % numero2);
        }
    }
}
