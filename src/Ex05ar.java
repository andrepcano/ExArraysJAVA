import java.util.Scanner;

public class Ex05ar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números irá ter cada vetor?");
        int n = sc.nextInt();

        int[] vect1 = new int[n];
        int[] vect2 = new int[n];
        int cont1 = 1;
        int cont2 = 1;

        System.out.println("\nDigite o valor do vetor A:");
        for (int i = 0; i < n; i++) {
            System.out.println("Valor " + cont1);
            int num1 = sc.nextInt();
            cont1 ++;
            vect1[i] = num1;
        }

        System.out.println("\nDigite o valor do vetor B:");
        for (int i = 0; i < n; i++) {
            System.out.println("Valor " + cont2);
            int num2 = sc.nextInt();
            cont2 ++;
            vect2[i] = num2;
        }

        System.out.println("\nVetor Resultante:");
        for (int i = 0; i < n; i++) {
            int soma = vect1[i] + vect2[i];
            System.out.println(soma);
        }
    }
}
