import java.util.Scanner;
public class App {
    public static void main(String[] args){
        
        System.out.print("Escreva o número ao lado: ");

        int numero;

        Scanner teclado = new Scanner(System.in);

        numero = teclado.nextInt();
        System.out.println("o número escolhido foi: " + numero);
        teclado.close();
    }
}
