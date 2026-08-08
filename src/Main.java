import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual a quantidade de atletas? ");
        int n = sc.nextInt();

        String nome;
        char sexo;
        double altura, peso;
        double somaPeso = 0;
        double maisAlto = 0.0;
        int contHomem = 0;
        int contMulher = 0;
        double somaAlturaMulheres = 0;
        String nomeMaisAlto = "";

        for (int i = 0; i < n; i++) {
            System.out.println("Digite os dados do atleta numero " + (i+1) + ":");
            System.out.print("Nome: ");
            sc.nextLine();
            nome = sc.nextLine();
            System.out.print("Sexo: ");
            sexo = sc.next().charAt(0);
            while (sexo != 'F' && sexo != 'M') {
                System.out.print("Valor invalido! Favor digitar F ou M: ");
                sexo = sc.next().charAt(0);
            }

            if (sexo == 'M') {
                contHomem++;
            }

            System.out.print("Altura: ");
            altura = sc.nextDouble();
            while (altura <= 0) {
                System.out.print("Valor invalido! Favor digitar um valor positivo: ");
                altura = sc.nextDouble();
            }

            if (altura > maisAlto) {
                maisAlto = altura;
                nomeMaisAlto = nome;
            }

            if (sexo == 'F') {
                contMulher++;
                somaAlturaMulheres += altura;
            }

            System.out.print("Peso: ");
            peso = sc.nextDouble();
            while (peso <= 0) {
                System.out.print("Valor invalido! Favor digitar um valor positivo: ");
                peso = sc.nextDouble();
            }
            somaPeso += peso;
        }

        double pesoMedio = somaPeso / n;
        double percentHomem = contHomem * 100.0 / n;

        System.out.println();
        System.out.println("RELATÓRIO:");
        System.out.printf("Peso médio dos atletas: %.2f%n", pesoMedio);
        System.out.println("Atleta mais alto: " + nomeMaisAlto);
        System.out.printf("Porcentagem de homens: %.1f %% %n", percentHomem);
        if (contMulher == 0) {
            System.out.println("Não há mulheres cadastradas");
        } else {
            double mediaAlturaMulheres = somaAlturaMulheres / contMulher;
            System.out.printf("Altura média das mulheres: %.2f%n", mediaAlturaMulheres);
        }

        sc.close();
    }
}
