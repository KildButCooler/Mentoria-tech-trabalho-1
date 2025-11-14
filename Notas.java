import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double[] notas = new double[4];

            System.out.println("Digite as 4 notas bimestrais do aluno (0.0 - 10.0):");

            for (int i = 0; i < 4; i++) {
                System.out.print("Nota " + (i + 1) + ": ");
                while (!sc.hasNextDouble()) {
                    System.out.print("Valor inválido. Digite um número para a nota " + (i + 1) + ": ");
                    sc.next();
                }
                double val = sc.nextDouble();
                while (val < 0 || val > 10) {
                    System.out.print("Nota fora do intervalo. Digite a nota " + (i + 1) + " (0-10): ");
                    val = sc.nextDouble();
                }
                notas[i] = val;
            }

            System.out.println("\nResultados:");

            double media1oBimestre = notas[0];
            double media2oBimestre = notas[1];
            double media3oBimestre = notas[2];
            double media4oBimestre = notas[3];

            double media1oSemestre = (media1oBimestre + media2oBimestre) / 2.0;
            double media2oSemestre = (media3oBimestre + media4oBimestre) / 2.0;
            double mediaFinal = (media1oSemestre + media2oSemestre) / 2.0;

            System.out.printf("1º Bimestre: %.1f 2º Bimestre: %.1f 1º Semestre: %.1f%n",
                    media1oBimestre, media2oBimestre, media1oSemestre);
            System.out.println("--------------------------------------------------------");
            System.out.printf("3º Bimestre: %.1f 4º Bimestre: %.1f 2º Semestre: %.1f%n",
                    media3oBimestre, media4oBimestre, media2oSemestre);
            System.out.println("--------------------------------------------------------");
            System.out.printf("Média Final: %.1f%n", mediaFinal);
        }
    }
}