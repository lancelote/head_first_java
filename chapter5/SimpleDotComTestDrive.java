public class SimpleDotComTestDrive {

    public static void main(String[] args) {
        SimpleDotCom dotCom = new SimpleDotCom();

        int[] locations = {2, 3, 4};
        dotCom.setLocationCells(locations);

        String result0 = dotCom.checkYourself("2");
        int hits0 = dotCom.getNumOfHints();
        String result1 = dotCom.checkYourself("1");
        int hits1 = dotCom.getNumOfHints();
        String result2 = dotCom.checkYourself("3");
        int hits2 = dotCom.getNumOfHints();
        String result3 = dotCom.checkYourself("4");
        int hits3 = dotCom.getNumOfHints();

        String testResult = "TESTS PASSED";
        if (!result0.equals("Hit") || !result1.equals("Miss") || !result2.equals("Hit") || !result3.equals("Sink") ||
                hits0 != 1 || hits1 != 1 || hits2 != 2 || hits3 != 3) {
            testResult = "TESTS FAILED";
        }

        System.out.println("-----");
        System.out.println(testResult);
    }
}
