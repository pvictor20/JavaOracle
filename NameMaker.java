import java.util.Scanner;

public class NameMaker {
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String firstName;
        String middleName;
        String lastName;
        String fullName;

        System.out.println("Digite seu primeiro nome:");
        firstName = sc.next();

        System.out.println("Digite seu nome do meio:");
        middleName = sc.next();

        System.out.println("Digite seu último nome:");
        lastName = sc.next();

        fullName = firstName.concat(middleName + lastName);
        System.out.println("Seu nome completo é " + fullName);

        System.out.println("Seu nome completo é: " + firstName + " " + middleName + " " + lastName);
        sc.close();
    }
    
}
