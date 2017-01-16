class PoorDog {

    private int size;
    private String name;

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }
}

public class PoorDogTestDrive {

    public static void main(String[] args) {
        PoorDog one = new PoorDog();
        System.out.println("Dog size: " + one.getSize());
        System.out.println("Dog name: " + one.getName());
    }
}