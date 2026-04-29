import java.util.Locale;
import java.util.Scanner;

public class Ex03ar {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cont = 1;

        System.out.println("Quer registrar quantas pessoas?");
        int n = sc.nextInt();

        String[] pessoas = new String[n];
        int[] idades = new int[n];
        double[] alturas = new double[n];

        for (int i = 0; i < pessoas.length; i++) {
            System.out.println("Dados da " + cont + " pessoa:");
            System.out.println("Nome: ");
            sc.nextLine();
            String pessoa = sc.nextLine();
            pessoas[i] = pessoa;

            System.out.println("Idade: ");
            int idade = sc.nextInt();
            idades[i] = idade;

            System.out.println("Altura: ");
            double altura = sc.nextDouble();
            alturas[i] = altura;
            cont ++;
        }


        double soma = 0;
        for (int i = 0; i < alturas.length; i++) {
            soma += alturas[i];
        }
        double mediaAltura = soma / n;
        System.out.printf("A media de altura é: %.2f%n", mediaAltura);

        int menores = 0;
        for (int i = 0; i < n; i++) {
            if (idades[i] < 16) {
                menores ++;
            }
        }
        double media = (menores / (double) n) * 100;
        System.out.printf("Porcentagem de pessoas menores de 16: %.1f%n", media);

        for (int i = 0; i < n; i++) {
            if (idades[i] < 16) {
                System.out.println("Nomes dos menores: " + pessoas[i]);
            }
        }
    }
}
