import java.util.Scanner;

public class SistemaEscolar {

    public static void main(String[] args) {
        // Usando try-with-resources para garantir o fechamento do Scanner
        try (Scanner sc = new Scanner(System.in)) {

            double[] notas = new double[8]; // Array para armazenar as 8 notas

            // Exibição das orientações sobre as notas 
            System.out.println("Digite as 8 notas anuais do aluno:");

            // Coleta das 8 notas do aluno
            for (int i = 0; i < 8; i++) {
                System.out.print("Nota " + (i + 1) + ": ");
                notas[i] = sc.nextDouble(); // Lê cada nota e armazena no array
            }

            // Cálculo e exibição das médias bimestrais, semestrais e final
            System.out.println("\nResultados:");

            // Médias bimestrais e semestrais do 1º semestre
            double media1oBimestre = notas[0];
            double media2oBimestre = notas[1];
            double media1oSemestre = (media1oBimestre + media2oBimestre) / 2;

            // Médias bimestrais e semestrais do 2º semestre
            double media3oBimestre = notas[2];
            double media4oBimestre = notas[3];
            double media2oSemestre = (media3oBimestre + media4oBimestre) / 2;

            // Cálculo da média final
            double mediaFinal = (media1oSemestre + media2oSemestre) / 2;

            // Exibição dos resultados no formato solicitado
            System.out.printf("1º Bimestre: %.1f 2º Bimestre: %.1f 1º Semestre: %.1f\n", media1oBimestre, media2oBimestre, media1oSemestre);
            System.out.println("--------------------------------------------------------");
            System.out.printf("3º Bimestre: %.1f 4º Bimestre: %.1f 2º Semestre: %.1f\n", media3oBimestre, media4oBimestre, media2oSemestre);
            System.out.println("--------------------------------------------------------");
            System.out.printf("Média Final: %.1f\n", mediaFinal);

        } // O Scanner será fechado automaticamente aqui
    }
}
