public class PrisonTest {
    public static void main(String[] args) {
        Prisoner bubba = new Prisoner();
        Prisoner twitch = new Prisoner();

        bubba.altura = 2.08;
        bubba.nome = "Bubba";
        bubba.sentenca = 4;

        twitch.altura = 1.73;
        twitch.nome = "Twitch";
        twitch.sentenca = 3;

        bubba = twitch; //Para ver tipo de memória heap e stack;

        System.out.println(bubba == twitch);


        //Isso para não ficar repetindo linha de código.
        Prisoner p01 = new Prisoner();
        Prisoner p02 = new Prisoner();

        p01.setField("Hugo", 2.0, 5);
        p02.setField("Jorge", 1.73, 2);


    }
}