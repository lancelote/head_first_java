class Puzzle4b {

    private int ivar;

    public void setIvar(int n) {
        ivar = n;
    }

    public int doStuff(int factor) {
        if (ivar > 100) {
            return ivar * factor;
        } else {
            return ivar * (5 - factor);
        }
    }
}


public class Puzzle4 {

    public static void main(String[] args) {
        Puzzle4b[] obs = new Puzzle4b[6];
        int y = 1;
        int x = 0;
        int result  = 0;

        while (x < 6) {
            obs[x] = new Puzzle4b();
            obs[x].setIvar(y);

            y *= 10;
            x += 1;
        }

        x = 6;

        while (x > 0) {
            x -= 1;
            result += obs[x].doStuff(x);
        }
        System.out.println("result: " + result);
    }
}
