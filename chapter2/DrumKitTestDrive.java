class DrumKit {
    boolean topHat = true;
    boolean snare = true;

    void playSnare() {
        System.out.println("bah-bah-bah");
    }

    void playTopHat() {
        System.out.println("din-din-din");
    }
}

public class DrumKitTestDrive {
    public static void main(String[] args) {
        DrumKit d = new DrumKit();

        d.playSnare();
        d.snare = false;
        d.playTopHat();

        if (d.snare == true) {
            d.playSnare();
        }
    }
}
