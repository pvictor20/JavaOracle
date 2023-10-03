/*
 /*
         * na segunda feira o fazendeiro Fred recolhe 100 ovos;
         * na terça ele recolheu 121 ovos
         * na quarta recolheu 117 ovos
         * qual é a media diaria?
         * quantos ovos poderiam ser recolhidos numa media mensal?
         * se um ovo for vendido a US$ 0,18, qual seria o lucro mensal?
         */public class Chickens02 {
    public static void main(String[] args) {
        //Put yout code here
        int segunda = 100;
        int terca = segunda + 21;
        int quarta = terca - 4;

        double dailyAverage = (segunda + terca + quarta) / 3;

        double monthlyAverage = dailyAverage * 30;
        double monthlyProfit = monthlyAverage * 0.18;


        System.out.println("Daily Average:   " +dailyAverage);
        System.out.println("Monthly Average: " +monthlyAverage);
        System.out.println("Monthly Profit:  $" +monthlyProfit);
    }
    
}
