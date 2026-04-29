import java.util.Locale;
import java.util.Scanner;

public class Ex02ar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Quantos números quer digitar?");
        int n = sc.nextInt();

        int cont = 1;
        double[] num = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite o " + cont + " número: ");
            cont += 1;
            num[i] = sc.nextDouble();
        }

        double soma = 0;
        for (int i = 0; i < n; i++) {
            soma += num[i];
        }

        System.out.printf("A soma é: %.2f%n", soma);
        double media = soma / n;
        System.out.printf("A média total é: %.2f%n", media);


        sc.close();
    }
}
