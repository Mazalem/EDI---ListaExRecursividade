import java.util.Scanner;
public class Ex1_B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a posição desejada da sequência de Fibonacci: ");
        try {
            int posicao = scan.nextInt();
            System.out.print("A Sequência de Fibonacci até a posição " + posicao + " é: ");
            for(int i = 0; i < posicao; i++) {
                System.out.print(fibonacci(i));
            }
        }
        catch(Exception ex) {
            System.out.println("Digite um número inteiro maior que 0.");
        }
        scan.close();
    }

    public static long fibonacci(int posicao) {
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