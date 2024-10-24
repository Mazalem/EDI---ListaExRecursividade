public class Ex2 {
    public static void main(String[] args) {
        try{
            System.out.println(potencia(5));
        }catch(Exception ex) {
            System.err.println(ex.getMessage());
        }
    }

    public static int potencia(int expoente) throws Exception {
        if(expoente < 0) {
            throw new Exception("Não fazemos potência de número negativo!");
        }
        if(expoente == 0)
            return 1;
        else
            return 2*potencia(expoente - 1);
    }
}