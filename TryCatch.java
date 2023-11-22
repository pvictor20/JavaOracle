import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
      try {
        //Parte do texto que possa causar alguma exceção.
      } catch (Exception e) {
        // Código de tratamento de exceções
      }


      int a = 100, res;

      try {
        System.out.println("Informe o valor de b");
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();

        System.out.println("Informe o valor de c");
        int c = sc.nextInt();

        res = 10 / (b-c);

        System.out.println("O resultado é " + res);
      } catch (Exception e) {
        String erroMsg = e.getMessage();
        System.out.println(erroMsg);
      }

      System.out.println("Depois do bloco catch");
    }
}
