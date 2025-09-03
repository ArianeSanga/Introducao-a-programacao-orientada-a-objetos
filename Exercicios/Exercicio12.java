import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // pedir um número
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        boolean ehPrimo = true; // começa como primo

        // números menores que 2 não são primos
        if (numero < 2) {
            ehPrimo = false;
        } else {
            // testa se o número tem divisores além de 1 e ele mesmo
            int i = 2;
            while (i < numero) {
                if (numero % i == 0) {
                    ehPrimo = false;
                }
                i = i + 1;
            }
        }

        // mostra o resultado
        if (ehPrimo) {
            System.out.println(numero + " é primo!");
        } else {
            System.out.println(numero + " não é primo.");
        }

        scanner.close();
    }
}


