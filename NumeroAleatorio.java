import java.util.Random;
public class NumeroAleatorio {
    public static void main(String[] args) {
        Random rndNum = new Random();
        int randomNum = rndNum.nextInt();
        System.out.println("Número aleatório: " + randomNum);

        var num = new Random();
        int numAleatorio = num.nextInt(10);
        System.out.println("Número aleatório entre 0 e 10: " + numAleatorio);
    }
}
