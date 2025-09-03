import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int idade; // idade digitada pelo usuário
        int soma = 0; // soma das idades
        int contador = 0; // conta quantas idades foram digitadas

        // pedir idade
        System.out.println("Digite sua idade (digite 0 para finalizar):");
        idade = scanner.nextInt();

        // enquanto não for 0, continuar somando e contando
        while (idade != 0) {
            soma = soma + idade;
            contador = contador + 1;

            // pedir próxima idade
            idade = scanner.nextInt();
        }

        // calcular e mostrar média se houver algum valor
        if (contador > 0) {
            double media = (double)soma / contador; // converter para double para não perder decimal
            System.out.println("A média das idades digitadas é: " + media);
        } else {
            System.out.println("Nenhuma idade foi digitada");
        }

        scanner.close();
    }
}
