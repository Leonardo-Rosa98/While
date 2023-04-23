import java.util.Scanner;

public class ImprimirNumerosPares{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = input.nextInt();
        int i = 0;
        input.close();
        
        while (i <= num){
            if(i % 2 == 0)
            System.out.println(i);
         i++;   
        }

    }
}