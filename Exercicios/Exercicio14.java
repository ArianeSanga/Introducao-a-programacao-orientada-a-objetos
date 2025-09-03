import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // numero de pessoas a serem entrevistadas
        int qtdPessoas = 5;
        int idade;
        int opiniao;

        // contadores para cada tipo de opinião
        int Contadorotimo = 0;
        int Contadorbom = 0;
        int Contadorregular = 0;

        // soma das idades das pessoas que responderam otimo
        int Somaidades = 0;

        int i = 0;
        while (i < qtdPessoas) {
            // ler idade
            System.out.println("Digite sua idade:");
            idade = scanner.nextInt();

            // ler opinião
            System.out.println("Digite sua opinião:");
            System.out.println("otimo(3), bom(2), regular(1):");
            opiniao = scanner.nextInt();

            // verificar a opinião e atualizar contadores
            if (opiniao == 3) {
                Somaidades = Somaidades + idade;
                Contadorotimo = Contadorotimo + 1;
            } else if (opiniao == 2) {
                Contadorbom = Contadorbom + 1;
            } else if (opiniao == 1) {
                Contadorregular = Contadorregular + 1;
            }

            i = i + 1; // próxima pessoa
        }

        // calcular media de idade das pessoas que responderam otimo
        double mediaOtimo = 0;
        if (Contadorotimo > 0) {
            mediaOtimo = (double)Somaidades / Contadorotimo;
        }

        // calcular porcentagem de pessoas que disseram bom
        double percBom = (Contadorbom * 100.0) / qtdPessoas;

        // mostrar resultados
        System.out.println("Media de idade das pessoas que disseram otimo: " + mediaOtimo);
        System.out.println("Quantidade de pessoas que responderam regular: " + Contadorregular);
        System.out.println("Porcentagem de pessoas que responderam bom: " + percBom + "%");

        scanner.close();
    }
}
