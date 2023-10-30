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
    }
}