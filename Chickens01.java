public class Chickens01 {
    public static void main(String[] args) {
        //Put yout code here
        int eggsPerChicken = 5;
        int chickenCount = 3;
    
        /*
         * na segunda ele tem 3 galinhas
         * na terça ganha mais uma totalizando 4 galinhas
         * na quarta ele tem só 2 galinhas
         * 
         * 5 ovos 
         * segunda tem 3 galinhas logo 5*3 = 15 ovos
         * na terça mais 5 ovos logo 20 ovos
         * na quarta sao 10 ovos
         * 
         */
        System.out.println("Tem uma galinha e logo somente 5 ovos.");
        System.out.println("Na segunda ganha mais três galinhas, então são " + chickenCount + " galinhas e ganha " + eggsPerChicken + " ovos, então ele têm no total " + eggsPerChicken*3 + " ovos.");
        System.out.println("Na terça ganha mais uma galinha então: " + (chickenCount = 4) + " galinhas e " + eggsPerChicken*4 + " ovos.");
        System.out.println("Na quarta perde duas galinhas, totalizando: " + (chickenCount = 2) + " galinhas e " + eggsPerChicken*chickenCount + " ovos.");

        chickenCount = 2;
        int totalEggs = eggsPerChicken * chickenCount;
        System.out.println("Então no total têm-se " + totalEggs + " de ovos.");
    }   
}
