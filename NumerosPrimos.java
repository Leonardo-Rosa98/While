import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Por favor, digite um número: ");
        int num = input.nextInt();
        int i = 2;

        while (i <= num) {
            boolean isPrimo = true;
            int j = 2;

            while (j <= i / 2) {
                if (i % j == 0) {
                    isPrimo = false;
                    break;
                }
                j++;
            }

            if (isPrimo) {
                System.out.println(i);
            }

            i++;
        }
    }
}
