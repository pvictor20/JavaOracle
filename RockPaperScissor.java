import java.util.Random;
import java.util.Scanner;
public class RockPaperScissor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero;
        int bot;
        System.out.println("Digite um número entre 0 e 2: ");
        numero = sc.nextInt();

       switch (numero) {
        case 0:
            System.out.println("Você escolheu PEDRA!!!!");
            break;
        case 1:
            System.out.println("Você escolheu PAPEL!!!!!");    
            break;
        case 2:
            System.out.println("Você escolheu TESOURA!!!!!");    
            break;
       
        default:
            break;
       }


       Random aleatorio = new Random();
       bot = aleatorio.nextInt(3);

       if (numero == 0 && bot == 1) {
        System.out.println("Você perdeu!");
       } else if (numero == 0 && bot == 2) {
        System.out.println("Você ganhou!!");
       } else if (numero == 0 && bot == 0) {
        System.out.println("EMPATE!!!!");
       }

         if (numero == 1 && bot == 2) {
        System.out.println("Você perdeu!");
       } else if (numero == 1 && bot == 0) {
        System.out.println("Você ganhou!!");
       } else if (numero == 1 && bot == 1) {
        System.out.println("EMPATE!!!!");
       }

         if (numero == 2 && bot == 0) {
        System.out.println("Você perdeu!");
       } else if (numero == 2 && bot == 1) {
        System.out.println("Você ganhou!!");
       } else if (numero == 2 && bot == 2) {
        System.out.println("EMPATE!!!!");
       }
       


        sc.close();
    }
}
