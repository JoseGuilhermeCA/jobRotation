import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dias;
        double soma = 0, media, menor, maior;
        int cont = 0;

        System.out.print("Digite o número de dias do mês: ");
        dias = sc.nextInt();

        double[] faturamento = new double[dias];

        // Leitura dos valores de faturamento diário
        for (int i = 0; i < dias; i++) {
            System.out.print("Digite o valor de faturamento do dia " + (i + 1) + ": ");
            faturamento[i] = sc.nextDouble();
            soma += faturamento[i];
        }

        // Cálculo da média mensal de faturamento
        media = soma / dias;

        // Encontrar o menor e maior valor de faturamento diário
        menor = faturamento[0];
        maior = faturamento[0];
        for (int i = 1; i < dias; i++) {
            if (faturamento[i] < menor) {
                menor = faturamento[i];
            }
            if (faturamento[i] > maior) {
                maior = faturamento[i];
            }
        }

        // Contar o número de dias com faturamento superior à média mensal
        for (int i = 0; i < dias; i++) {
            if (faturamento[i] > media) {
                cont++;
            }
        }

        // Impressão dos resultados
        System.out.println("O menor valor de faturamento diário é: " + menor);
        System.out.println("O maior valor de faturamento diário é: " + maior);
        System.out.println("O número de dias com faturamento superior à média mensal é: " + cont);

        sc.close();
    }
}
