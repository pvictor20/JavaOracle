import java.util.Scanner;

public class ComputeSum {

    public static void main(String[] args) {
        int somaNum = 0;
       Scanner sc = new Scanner(System.in);
       for (int numero = 0; numero <= 10; numero++) {

        System.out.println("Digite um número: ");
        numero = sc.nextInt();

        somaNum += numero;
        System.out.println("A soma foi de: " + somaNum);
       }

       sc.close();

    }
}
