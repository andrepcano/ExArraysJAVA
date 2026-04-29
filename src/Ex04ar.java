import java.util.Locale;
import java.util.Scanner;

public class Ex04ar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);


        int cont = 1;
        System.out.println("Quantos números você ira digitar?");
        int n = sc.nextInt();
        double[] numeros = new double[n];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o " + cont + " numero que direi qual é o maior:");
            double num = sc.nextDouble();
            numeros[i] = num;
            cont ++;
        }

        double maiorNum =  numeros[0];
        int posicao = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maiorNum) {
                maiorNum = numeros[i];
                posicao = i;
            }
        }

        System.out.println("O maior número é o " + maiorNum);
        System.out.println("Na posição " + posicao);

        sc.close();
    }
}
