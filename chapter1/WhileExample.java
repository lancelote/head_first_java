public class WhileExample {
    public static void main(String[] args) {
        int var = 1;
        System.out.println("Before the loop");

        while(var < 4) {
            System.out.println("Inside the loop");
            System.out.println("x value is equal to " + var);
            var = var + 1;
        }

        System.out.println("After the loop");
    }
}