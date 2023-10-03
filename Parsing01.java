public class Parsing01 {
    public static void main(String[] args) {
        //Declare and intitialize 3 Strings: shirtPrice, taxRate, and gibberish
        
        int shirtPrice = Integer.parseInt("15");
        double taxRate = Double.parseDouble("0.05");
        //gibberish Gibberish = 887ds78d5sa4d6; ??????????
        
        //Parse shirtPrice and taxRate, and print the total tax
        
        double price = shirtPrice * taxRate;
        System.out.println(price);
        
        //Try to parse taxRate as an int
        taxRate = Integer.parseInt("0.05");
        //Try to parse gibberish as an int
        
    }
    
}
