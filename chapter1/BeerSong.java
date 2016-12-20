public class BeerSong {
    public static void main(String[] args) {
        int total = 3;
        String plural = " bottles ";

        while (total > 0) {
            System.out.println(total + plural + "of beer on the wall, " + total + plural + "of beer.");
            total -= 1;
            if (total == 1) {
                plural = " bottle ";
            }
            System.out.println("Take one down and pass it around, " + total + plural + "of beer on the wall.");
        }

        System.out.println("No more bottle of beer on the wall, no more bottles of beer.");
        System.out.println("Go to the store and buy some more, 99 bottles of beer on the wall.");
    }
}