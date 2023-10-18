import java.util.Random;
import java.util.Scanner;

public class Loteria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int numGanhador;
        System.out.println("Digite um número entre 1 e 10: ");
        num = sc.nextInt();

        Random numAleatorio = new Random();
        numGanhador = numAleatorio.nextInt(10) + 1;

        System.out.println("Seu número é: " + num);
        System.out.println("O número vencedor é: " + numGanhador);

        if (num == numGanhador) {
            System.out.println("Você venceu!!!");


        sc.close();
    } else{
        System.out.println("Você perdeu!");
         }
    }
}
