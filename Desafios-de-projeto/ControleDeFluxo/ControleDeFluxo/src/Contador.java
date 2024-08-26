import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = Integer.parseInt(terminal.nextLine());
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = Integer.parseInt(terminal.nextLine());

        try {
            contar(parametroUm, parametroDois);
        }catch (ParametrosInvalidosException exception) {
            System.out.println(exception.getMessage());
        }
    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
       if(parametroUm > parametroDois) {
           throw new ParametrosInvalidosException();
       }
        int contagem = parametroDois - parametroUm;
        IntStream.iterate(1, num -> num + 1).limit(contagem).forEach(num -> System.out.println("Imprimindo o número %d".formatted(num)));
    }
}