public class SimpleDotComGame {

    public static void main(String[] args) {
        // Declare integer numOfGuesses variable to store number of player turns
        int numOfGuesses = 0;

        // Special class to receive user input
        GameHelper helper = new GameHelper();

        // Create a SimpleDotCom object
        SimpleDotCom theDotCom = new SimpleDotCom();

        // Calculate random position of the initial cell from 0 to 4
        int randomNum = (int) (Math.random() * 5);

        // Create an int array with 3 items using the calculated random number increasing it by 1 and then 2
        int[] locations = {randomNum, randomNum + 1, randomNum + 2};

        // Set location cells
        theDotCom.setLocationCells(locations);

        // Declare bool isAlive variable to store if the dotCom is still alive
        boolean isAlive = true;

        // Wile dotCom isAlive
        while (isAlive) {
            // Get user input
            String guess = helper.getUserInput("Inter the number");

            // Call checkYourself
            String result = theDotCom.checkYourself(guess);

            // Increase numOfGuesses
            numOfGuesses++;

            // Check if the dotCom is sink
            if (result.equals("Sink")) {
                // If it is:
                // Set isAlive to false
                isAlive = false;

                // Print numOfGuesses
                System.out.println("Yo used " + numOfGuesses + " tries!");
            }
        }
    }
}
