public class ArithmetischeOperationen {
    public static void main(String[] args) {


        int a = 420;
        int b = 69;

        System.out.println("Arithmetische Operation + ergibt: " + (a + b));
        System.out.println("Arithmetische Operation - ergibt: " + (a - b));
        System.out.println("Arithmetische Operation * ergibt: " + (a * b));

        //hier findet eine typen anpassung statt. ich kann keine 2 ints dividieren (wo ein double rauskommt)
        System.out.println("Arithmetische Operation / ergibt: " + ((double) a / (double) b));

        //kleiner trick um ein int umzuwandeln
        double tricky = a / (1.0 * b);

        System.out.println("Arithmetische Operation % (modulo) ergibt: " + (a % b));

    }
}
