public class SimpleDotCom {
    // locationCells - int array for cells storing
    private int[] locationCells;

    // numOfHints    - int variable for storing number of hits
    private int numOfHints = 0;

    // checkYourself()    - method which accepts user turn (String), checks it and returns "hit", "miss", "sink"
    public String checkYourself(String stringGuess) {
        // Get user turn as a string
        // Convert user turn to int
        int guess = Integer.parseInt(stringGuess);

        // Default value is miss
        String result = "Miss";

        // Repeat with each cell
        for (int cell : locationCells) {
            // Compare user turn and cell placement
            if (guess == cell) {
                // If user correct
                result = "Hit";

                // +1 hit count
                numOfHints += 1;
                break;
            }
        }
        // Check if this is a last cell
        //If this is a third hit then return "sink"
        if (numOfHints == locationCells.length) {
            result = "Sink";
        }

        System.out.println(result);
        return result;
    }

    // setLocationCells() - setter which accepts int array with three cells
    public void setLocationCells(int[] locations) {
        locationCells = locations;
    }

    public int getNumOfHints() {
        return numOfHints;
    }
}
