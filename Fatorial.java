
import java.util.Scanner;

public class Fatorial {
    public static void main( String [] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int num = input.nextInt();
        input.close();

        int i = num;
        System.out.print(num + " * " + i + " = ");
        int resultado = i * num;
        System.out.println(resultado);
        
        while(i > 1){
            i--;
            System.out.print(resultado + " * " + i + " = ");
            resultado = resultado * i;
            System.out.println(resultado);
            
        }
        
    }
    
}
