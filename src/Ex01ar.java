import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Ex01ar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Quantos números você ira digitar?");
        int n = sc.nextInt();
        int cont = 1;
        int[] num = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite o " + cont + " número: ");
            cont += 1;
            num[i] = sc.nextInt();
        }

        System.out.println("Numeros Negativos: ");

        for (int i = 0; i < n; i++) {
            if (num[i] < 0) {
                System.out.println(num[i]);
            }
        }

        sc.close();
    }
}