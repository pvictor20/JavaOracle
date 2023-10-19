import java.util.Scanner;

public class AgeValidity {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade;
        System.out.println("Digite sua idade: ");
        idade = sc.nextInt();


        boolean idadeMenor = false;

        if (idade < 18) {
            System.out.println(idadeMenor);
            System.out.println("Não pode dirigir!");
        } else {
            System.out.println("Pode dirigir!");
        }


    sc.close();
       
    }
}
