public class ElectricGuitar {

    private String brand;
    private int numOfPickups;
    private boolean rockStarUseIt;

    String getBrand() {
        return brand;
    }

    public void setBrand(String aBrand) {
        brand = aBrand;
    }

    public int getNumOfPickups() {
        return numOfPickups;
    }

    public void setNumOfPickups(int num) {
        numOfPickups = num;
    }

    public boolean getRockStarUseIt() {
        return rockStarUseIt;
    }

    public void setRockStarUseIt(boolean yesOrNon) {
        rockStarUseIt = yesOrNon;
    }
}
