import java.util.Scanner;

public class WatchMovie {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int ingresso;
        int classificacao;

        System.out.print("Enter the movie ticket price \n");
        ingresso = sc.nextInt();

        System.out.println("Digite a classificação do filme");
        classificacao = sc.nextInt();

        
        if (classificacao >= 5 && ingresso == 12) {
            System.out.println("Estou interessado em assistir o filme");
        } else {
            System.out.println("Não estou interessado em ver o filme");
        }


        sc.close();

    }
}
