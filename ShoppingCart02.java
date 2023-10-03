public class ShoppingCart02 {
    public static void main(String[] args) {
        String custName = "Alex";
        String itemDesc = "camisas";
        String message = custName+" quer comprar uma ou mais "+itemDesc;
        
        // Declare and initialize numeric fields: price, tax, quantity.   
        double preco = 35;
        double imposto = (preco * 0.10);
         int qtd = 2;
        // Declare and assign a calculated totalPrice
         double totalPrice = (preco + imposto) * qtd;
        // Modify message to include quantity 
        
        System.out.println("São " + qtd + " de roupas.");
        
        // Print another message with the total cost
        System.out.println(message + ", ele decidiu comprar duas, então o valor total ficou em R$" + totalPrice );
    }    
}
