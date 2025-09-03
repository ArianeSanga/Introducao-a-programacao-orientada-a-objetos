import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // contadores
        int totalS = 0; // total que respondeu sim
        int totalN = 0; // total que respondeu nao
        int mulheresS = 0; // mulheres que responderam sim
        int homensN = 0; // homens que responderam nao
        int homens = 0; // total de homens entrevistados

        int i = 1;
        while (i <= 10) {
            // ler sexo
            System.out.println("Digite o sexo (M/F): ");
            char sexo = scanner.next().charAt(0);

            // contar homens
            if (sexo == 'M' || sexo == 'm') {
                homens++;
            }

            // ler resposta
            System.out.println("Gostou do produto? (S/N): ");
            char resposta = scanner.next().charAt(0);

            // atualizar contadores
            if (resposta == 'S' || resposta == 's') {
                totalS++;
                if (sexo == 'F' || sexo == 'f') {
                    mulheresS++;
                }
            } else if (resposta == 'N' || resposta == 'n') {
                totalN++;
                if (sexo == 'M' || sexo == 'm') {
                    homensN++;
                }
            }

            i = i + 1; // próxima pessoa
        }

        // calcular percentual de homens que responderam nao
        double percHomensN = 0;
        if (homens > 0) {
            percHomensN = (homensN * 100.0) / homens;
        }

        // mostrar resultados
        System.out.println("Total que responderam SIM: " + totalS);
        System.out.println("Total que responderam NAO: " + totalN);
        System.out.println("Mulheres que responderam SIM: " + mulheresS);
        System.out.println("Percentual de homens que responderam NAO: " + percHomensN + "%");

        scanner.close();
    }
}
