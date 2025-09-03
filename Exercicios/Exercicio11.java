import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // variavel para guardar o valor do carro
        int valorCarro;

        // vetores com a quantidade de parcelas e o percentual de acréscimo
        int[] NumParcel = {6,12,18,24,30,36,42,48,54,60};
        int[] PorcentualAcresc = {3,6,9,12,15,18,21,24,27,30};
        
        // pedindo o valor do carro
        System.out.print("Digite o valor do carro: ");
        valorCarro = scanner.nextInt();
        
        // calculo do preço a vista (20% de desconto)
        double precoAVista = valorCarro * 0.80;
        System.out.println("\n--- TABELA DE PREÇOS ---");
        System.out.println("À VISTA: R$ " + precoAVista);

        int i = 0;
        // enquanto i for menor que 10, mostramos as opções de parcelas
        while (i < 10) {
            // calculo do preço final com acréscimo
            double precoFinal = valorCarro * (1 + PorcentualAcresc[i] / 100.0);
            
            // calculo do valor de cada parcela
            double valorParcela = precoFinal / NumParcel[i];

            // mostrando as informações da opção
            System.out.println("\nParcelas: " + NumParcel[i]);
            System.out.println("Acréscimo: " + PorcentualAcresc[i] + "%");
            System.out.println("Preço Final: R$ " + precoFinal);
            System.out.println("Valor da Parcela: R$ " + valorParcela);

            // incrementando o i para passar para a próxima posição
            i = i + 1;
        }

        scanner.close();
    }
}


