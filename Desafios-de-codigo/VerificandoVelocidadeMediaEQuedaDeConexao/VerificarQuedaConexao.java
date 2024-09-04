package VerificandoVelocidadeMediaEQuedaDeConexao;

import java.util.Arrays;
import java.util.Scanner;

public class VerificarQuedaConexao {
    public static String verificarQuedaConexao(String[] velocidades) {
        return Arrays.stream(velocidades)
                .mapToInt(Integer::valueOf)
                .anyMatch(n -> n == 0) ? "Queda de Conexao" : "Sem Quedas";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário a lista de velocidades de conexão registradas a cada hora
        String input = scanner.nextLine();

        // Convertendo a entrada em uma lista de strings
        String[] velocidades = input.split(",");

        // Verificando se houve queda de conexão
        String resultado = verificarQuedaConexao(velocidades);

        // Exibindo o resultado da verificação
        System.out.println(resultado);

        scanner.close();
    }
}
