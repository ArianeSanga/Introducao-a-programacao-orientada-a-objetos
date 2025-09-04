import java.util.Scanner; 

public class Exercicio17 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); 

        int numero; // aqui eu guardo o canal
        int quantidade = 0; // total de pessoas assistindo todos os canais
        int numeroCanal4 = 0; // total de pessoas no canal 4
        int numeroCanal5 = 0; // total de pessoas no canal 5
        int numeroCanal7 = 0; // total de pessoas no canal 7
        int numeroCanal12 = 0; // total de pessoas no canal 12
        int numeroTelespectadores; // quantidade de pessoas em cada casa

        // peço o número do canal
        System.out.println("Digite o número do canal (4, 5, 7, 12) ou 0 para sair:");
        numero = scanner.nextInt();

        // repito enquanto o canal não for 0
        while (numero != 0) {

            // peço o número de pessoas que estavam assistindo
            System.out.println("Digite a quantidade de telespectadores: ");
            numeroTelespectadores = scanner.nextInt();

            // somo no total de pessoas (geral)
            quantidade += numeroTelespectadores;

            // verifico qual canal foi digitado e somo nele
            if (numero == 4) {
                numeroCanal4 += numeroTelespectadores;
            } else if (numero == 5) {
                numeroCanal5 += numeroTelespectadores;
            } else if (numero == 7) {
                numeroCanal7 += numeroTelespectadores;
            } else if (numero == 12) {
                numeroCanal12 += numeroTelespectadores;
            }

            // no fim do while peço o próximo canal
            System.out.println("Digite o número do canal (4, 5, 7, 12) ou 0 para sair:");
            numero = scanner.nextInt();
        }

        // agora calculo as porcentagens
        // preciso transformar em double para ter resultado com vírgula
        double porcentagem4 = (numeroCanal4 * 100.0) / quantidade;
        double porcentagem5 = (numeroCanal5 * 100.0) / quantidade;
        double porcentagem7 = (numeroCanal7 * 100.0) / quantidade;
        double porcentagem12 = (numeroCanal12 * 100.0) / quantidade;

        // mostro os resultados
        System.out.println("\nTotal de pessoas pesquisadas: " + quantidade);
        System.out.println("Canal 4: " + numeroCanal4 + " pessoas (" + porcentagem4 + "%)");
        System.out.println("Canal 5: " + numeroCanal5 + " pessoas (" + porcentagem5 + "%)");
        System.out.println("Canal 7: " + numeroCanal7 + " pessoas (" + porcentagem7 + "%)");
        System.out.println("Canal 12: " + numeroCanal12 + " pessoas (" + porcentagem12 + "%)");

        scanner.close(); // fecho o scanner
    }
}
