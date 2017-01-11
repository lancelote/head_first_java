class Dog2 {
    int size;
    String name;

    void bark() {
        if (size > 60) {
            System.out.println("Wof Wof!");
        } else if (size > 14) {
            System.out.println("Woof Woof!");
        } else {
            System.out.println("Wof!");
        }
    }
}

public class DogTestDrive2 {
    public static void main(String[] args) {
        Dog one = new Dog();
        one.size = 70;
        Dog two = new Dog();
        two.size = 8;
        Dog three = new Dog();
        three.size = 35;

        one.bark();
        two.bark();
        three.bark();
    }
}
