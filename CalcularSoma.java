import java.util.Scanner;

public class CalcularSoma {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = input.nextInt();
        int i = 0;
        int soma = 0;

        while (i <= num){
            soma = soma + i;
            System.out.println("numero: " + i + " Soma: " + soma);
            i++;
        }
        input.close();
    }
}
