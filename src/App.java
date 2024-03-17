public class App {
    public static void main(String[] args) throws Exception {
        
        final double KILOMETERS_PER_MILE = 1.609;

        System.out.println("Miles\tKilometers");

        for (int i = 1; i <= 10; i++) {
            System.out.println( i + "\t" + i* KILOMETERS_PER_MILE);
        }
    }
}
