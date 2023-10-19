import java.util.Scanner;

public class ChkOddEven {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Digite um número entre 1 e 10:");
        num =sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("PAR!!!!");
        } else {
            System.out.println("IMPAR!!!!");
        }

        sc.close();
        
    }
}
