import java.util.Scanner;

class Input03 {

    public static void main(String[] args) {
        //Create a Scanner
        Scanner sc = new Scanner(System.in);
        //Find and print the sum of three integers entered by the user
        int a;
        int b;
        int c;

        System.out.println("Escreva o primeiro numero:");
        a = sc.nextInt();

        System.out.println("Escreva o segundo numero:");
        b = sc.nextInt();

        System.out.println("Escreva o terceiro numero:");
        c = sc.nextInt();
        
        int result = a + b + c;

        System.out.println("O resultado da somatória é: " + result);
        
        //Remember to close the Scanner
        sc.close();
    }
}
