public class Tip01 {
    public static void main(String[] args) {
        //Find everyone's indivudlal total after tax(5%) and tip(15%)
        
        /*This is what everyone owes before tax and tip:
        Person 1: $10
        Person 2: $12
        Person 3: $9
        Person 4: $8
        Person 5: $7
        Person 6: $15
        Person 7: $11
        Person 8: $30
        */

        double imposto = 0.05;
        double gorjeta = 0.15;

        System.out.println("Pessoa 1 pagou: R$" + ((10*gorjeta) + (10*imposto) + 10));
        System.out.println("Pessoa 2 pagou: R$" + ((12*gorjeta) + (12*imposto) + 12));
        System.out.println("Pessoa 3 pagou: R$" + ((9*gorjeta) + (9*imposto) + 9));
        System.out.println("Pessoa 4 pagou: R$" + ((8*gorjeta) + (8*imposto) + 8));
        System.out.println("Pessoa 5 pagou: R$" + ((7*gorjeta) + (7*imposto) + 7));
        System.out.println("Pessoa 6 pagou: R$" + ((15*gorjeta) + (15*imposto) + 15));
        System.out.println("Pessoa 7 pagou: R$" + ((11*gorjeta) + (11*imposto) + 11));
        System.out.println("Pessoa 8 pagou: R$" + ((30*gorjeta) + (30*imposto) + 30));
        
    }    
}
