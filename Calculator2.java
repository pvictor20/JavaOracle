public class Calculator2 {
    public double tax = .05;
    public double tip = .15;  //Change tax and tip if you prefer different values
    public double originalPrice = 0;
    
    public void findTotal(){
        //Calculate an individual's total after tax and tip
        //Print this value
        String[] names = {"Alex", "Bob", "Carol", "David", "Eve", "Frank", "George", "Hannah"};
        double[] prices = {10, 12, 9, 8, 7, 15, 11, 30};
        
        for (int i = 0; i < names.length; i++) {
            double total = prices[i] * (1 + 0.05 + 0.15);
            System.out.println(names[i] + " deve pagar " + total);
        }
    }
}
