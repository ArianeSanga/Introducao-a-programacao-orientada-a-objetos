import java.util.Scanner;

public class Exercicio18 {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int idade;
        char sexo;
        double salario;

        int qtde = 0; // quantidade de pessoas
        double soma_salario = 0.0;

        final int max_idade = 150;
        final int min_idade = -1;
        int menor_idade = max_idade;
        int maior_idade = min_idade;

        int qtde_f200 = 0; // mulheres com salário até 200

        // controlar menor salário
        double menor_salario = Double.MAX_VALUE;
        int idade_menor_salario = 0;
        char sexo_menor_salario = ' ';

        boolean prossiga;

        System.out.printf("Informe a idade (anos, negativo para finalizar): ");
        idade = console.nextInt();

        if (idade > 0) {
            prossiga = true;
        } else {
            prossiga = false;
        }

        while (prossiga == true) {
            System.out.printf("Informe o sexo (M/F): ");
            sexo = console.next().charAt(0);

            System.out.printf("Digite seu salario: ");
            salario = console.nextDouble();

            qtde = qtde + 1;
            soma_salario += salario; 

            // menor idade
            if (idade < menor_idade) {
                menor_idade = idade;
            }
            // maior idade
            if (idade > maior_idade) {
                maior_idade = idade;
            }

            // mulheres com salario até 200
            if (sexo == 'f' || sexo == 'F') {
                if (salario <= 200) {
                    qtde_f200++;
                }
            }

            // verificar menor salário de todos
            if (salario < menor_salario) {
                menor_salario = salario;
                idade_menor_salario = idade;
                sexo_menor_salario = sexo;
            }

            // ler novamente idade para decidir se continua
            System.out.printf("Informe a idade (anos, negativo para finalizar): ");
            idade = console.nextInt();

            if (idade > 0) {
                prossiga = true;
            } else {
                prossiga = false;
            }
        }

        System.out.printf("Coleta finalizada!\n");

        if (qtde != 0) {
            System.out.printf("A média dos salários do grupo é: %.2f\n", soma_salario / qtde);
            System.out.printf("A menor idade do grupo é: %d\n", menor_idade);
            System.out.printf("A maior idade do grupo é: %d\n", maior_idade);
            System.out.printf("A quantidade de mulheres com salário até R$200 é: %d\n", qtde_f200);
            System.out.printf("A pessoa com menor salário tem %d anos e é do sexo %c (salário = %.2f)\n",
                    idade_menor_salario, sexo_menor_salario, menor_salario);
        }

        console.close();
    }
}
