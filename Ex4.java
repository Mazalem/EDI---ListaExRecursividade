public class Ex4 {
    public static void main(String[] args) {
        try{
            System.out.println(multiplicacao(2, 4));
        }catch(Exception ex) {
            System.err.println(ex.getMessage());
        }
    }

    public static int multiplicacao(int num1, int num2) throws Exception {
        if(num1 < 0 || num2 < 0) {
            throw new Exception("Não fazemos a multiplicação de número negativo!");
        }
        if(num2 == 0) {
            return 0;
        }
        else {
            return num1 + (multiplicacao(num1, num2-1));
        }
    }
}
