public class Ex4 {
    public static void main(String[] args) {
        System.out.println(multiplicacao(2, 4));
    }

    public static int multiplicacao(int num1, int num2) {
        if(num2 == 0) {
            return 0;
        }
        else {
            return num1 + (multiplicacao(num1, num2-1));
        }
    }
}
