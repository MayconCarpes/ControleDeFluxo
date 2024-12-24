import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Entrada dos parâmetros
            System.out.println("Digite o primeiro número:");
            int parametro1 = scanner.nextInt();

            System.out.println("Digite o segundo número:");
            int parametro2 = scanner.nextInt();

            // Validação e execução
            contar(parametro1, parametro2);


        } catch (ParametrosInvalidosException e) {
            System.err.println(e.getMessage());
        } catch (Exception e) {
            System.err.println("Ocorreu um erro inesperado: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException {
        // Verifica se os parâmetros são válidos
        if (parametro1 >= parametro2) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        // Calcula o número de interações
        int numeroInteracoes = parametro2 - parametro1;

        // Realiza as interações e imprime os números
        for (int i = 1; i <= numeroInteracoes; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
