import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // variáveis para somar os pesos
        int soma1a10 = 0;
        int soma11a20 = 0;
        int soma21a30 = 0;
        int soma31mais = 0;

        // variáveis para contar quantas pessoas em cada faixa
        int cont1a10 = 0;
        int cont11a20 = 0;
        int cont21a30 = 0;
        int cont31mais = 0;

        int i = 1;
        while (i <= 15) {
            System.out.println("Digite idade da pessoa " + i + ": ");
            int idade = scanner.nextInt();

            System.out.println("Digite o peso da pessoa " + i + ": ");
            int peso = scanner.nextInt();

            // separando pelas faixas etárias
            if (idade >= 1 && idade <= 10) {
                soma1a10 = soma1a10 + peso;
                cont1a10 = cont1a10 + 1;
            } else if (idade >= 11 && idade <= 20) {
                soma11a20 = soma11a20 + peso;
                cont11a20 = cont11a20 + 1;
            } else if (idade >= 21 && idade <= 30) {
                soma21a30 = soma21a30 + peso;
                cont21a30 = cont21a30 + 1;
            } else if (idade >= 31) {
                soma31mais = soma31mais + peso;
                cont31mais = cont31mais + 1;
            }

            i = i + 1; // próximo
        }

        // mostrando resultados
        System.out.println("\n--- Média de pesos por faixa etária ---");
        if (cont1a10 > 0) {
            System.out.println("1 a 10 anos: " + (soma1a10 / (double) cont1a10));
        }
        if (cont11a20 > 0) {
            System.out.println("11 a 20 anos: " + (soma11a20 / (double) cont11a20));
        }
        if (cont21a30 > 0) {
            System.out.println("21 a 30 anos: " + (soma21a30 / (double) cont21a30));
        }
        if (cont31mais > 0) {
            System.out.println("31 anos ou mais: " + (soma31mais / (double) cont31mais));
        }

        scanner.close();
    }
}

