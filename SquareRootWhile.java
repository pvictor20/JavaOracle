import java.util.Scanner;

public class SquareRootWhile {
    public static void main(String[] args) {
        // Variável para armazenar o número digitado pelo usuário
        int numero;

        // Loop para solicitar o número ao usuário
        while (true) {
            // Solicita o número ao usuário
            System.out.println("Digite um número não negativo: ");

            // Lê o número digitado pelo usuário
            Scanner scanner = new Scanner(System.in);
            numero = scanner.nextInt();

            // Verifica se o número é não negativo
            if (numero >= 0) {
                break;
            }

            System.out.println("Número inválido. Digite novamente.");

            scanner.close();
        }

        // Calcula a raiz quadrada do número usando o método de bissecção
        double raiz = bisseccao(numero);

        
        System.out.println("A raiz quadrada de " + numero + " é " + raiz);
    }

    private static double bisseccao(int numero) {
       
        double a = 0;
        double b = numero;

        
        double raiz = 0;

        
        while (b - a > 0.000001) {
            
            raiz = (a + b) / 2;

            
            if (raiz * raiz == numero) {
                
                break;
            } else if (raiz * raiz < numero) {
                
                a = raiz;
            } else {
                
                b = raiz;
            }
        }

        return raiz;
    }
}
    
