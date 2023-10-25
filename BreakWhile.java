public class BreakWhile {
    public static void main(String[] args) {
        int i =0;

        while (i < 10) {
            System.out.println(i + "\t");
            i++;

            if (i == 4) {
                break;
            }
        }
    }
}
