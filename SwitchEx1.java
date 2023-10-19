import java.util.Scanner;

public class SwitchEx1 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int mes;

        System.out.println("Digite um mês em número: ");
        mes = sc.nextInt();

        switch (mes) {
            case 1:
                System.out.println("Você digitou 1, que equivale a Janeiro!");
                break;
            case 2:
                System.out.println("Você digitou 2, que equivale a Fevereiro!");
                break;
            case 3:
                System.out.println("Você digitou 3, que equivale a Março!");
                break;
            case 4:
                System.out.println("Você digitou 4, que equivale a Abril!");
                break;
            case 5:
                System.out.println("Você digitou 5, que equivale a Maio!");
                break;                
            case 6:
                System.out.println("Você digitou 6, que equivale a Junho!");
                break;
            case 7:
                System.out.println("Você digitou 7, que equivale a Julho!");
                break; 
            case 8:
                System.out.println("Você digitou 8, que equivale a Agosto!");
                break;
            case 9:
                System.out.println("Você digitou 9, que equivale a Setembro!");
                break;
            case 10:
                System.out.println("Você digitou 10, que equivale a Outubro!");
                break;
            case 11:
                System.out.println("Você digitou 11, que equivale a Novembro!");
                break;
            case 12:
                System.out.println("Você digitou 12, que equivale a Dezembro!");
                break;                       
            default:
            System.out.println("Número incorreto!");
                break;
        }






        sc.close();
    }
}
