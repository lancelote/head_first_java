public class SimpleDotComTestDrive {

    public static void main(String[] args) {
        SimpleDotCom dot = new SimpleDotCom();

        int[] locations = {2, 3, 4};
        dot.setLocationCells(locations);

        String result1 = dot.checkYourself("2");

        String testResult = "FAIL";
        if (result.equals("Hit")) {
            testResult = "OK";
        }
    }
}
