import java.util.Random;
public class NumeroAleatorio {
    public static void main(String[] args) {
        Random rndNum = new Random();
        int randomNum = rndNum.nextInt();
        System.out.println("Número aleatório: " + randomNum);
    }
}
