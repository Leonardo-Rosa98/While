import java.util.Scanner;

public class Tabuada {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o número que deseja saber a tabuada: ");
        int num  = input.nextInt();
        int i = 0;
        
        while(i <= 10){
            System.out.println(num + " * " + i + " = " + i * num);
            i++;
        }
        
    }
}
